package com.eminenceinnovation.util;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final JwtTokenUtil jwtTokenUtil;
    private final AuthenticationManager authenticationManager;

//    public JwtAuthenticationFilter(AuthenticationManager authenticationManager, JwtTokenUtil jwtTokenUtil) {
//        this.jwtTokenUtil = jwtTokenUtil;
//        setAuthenticationManager(authenticationManager);
//    }
    
    public JwtAuthenticationFilter(AuthenticationManager authenticationManager, JwtTokenUtil jwtTokenUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        // Implement the logic to authenticate users based on the provided credentials (if needed)
        // For example, if you have a login API, you can validate the user credentials here
        // If the authentication is successful, return the Authentication object; otherwise, return null
        // Implement this part based on your specific use case

        // For this example, we're not implementing full authentication logic, as we are using JWT for demonstration purposes.
        // The actual authentication may involve checking the user's credentials in a database or external system.

        // For demonstration purposes, let's assume we have a login API that returns a username.
        // In this case, we use the username as the principal for authentication.
        String username = "user"; // Replace this with the actual authenticated username if applicable.

        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, null));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        // Once the user is successfully authenticated, generate and add the JWT token to the response header.
        String username = ((org.springframework.security.core.userdetails.User) authResult.getPrincipal()).getUsername();
        String token = jwtTokenUtil.generateToken(username, "ROLE_USER"); // Assuming ROLE_USER for this example.

        response.addHeader("Authorization", "Bearer " + token);
    }
}
