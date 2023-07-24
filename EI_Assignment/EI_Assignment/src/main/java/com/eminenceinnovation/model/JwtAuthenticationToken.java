package com.eminenceinnovation.model;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthenticationToken implements Authentication {

    private final String token;
    private final Collection<? extends GrantedAuthority> authorities;
    private boolean isAuthenticated;
    private final Object principal;

    public JwtAuthenticationToken(String token) {
        this.token = token;
        this.authorities = null;
        this.isAuthenticated = false;
        this.principal = null;
    }

    // You can also add other constructors and methods as needed.

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }

    @Override
    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public String getName() {
        return null;
    }

    public String getToken() {
        return token;
    }
}
