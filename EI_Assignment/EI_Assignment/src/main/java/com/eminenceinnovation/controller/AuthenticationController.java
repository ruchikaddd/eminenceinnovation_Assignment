package com.eminenceinnovation.controller;
//package com.eminenceinnovation.Controller;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.eminenceinnovation.Model.User;
//import com.eminenceinnovation.util.JwtUtils;
//
//@RestController
//public class AuthenticationController {
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<String> authenticate(@RequestBody User userCredentials) {
//      
//        if (isValidCredentials(userCredentials)) {
//            List<String> roles = getUserRoles(userCredentials.getUsername());
//            String token = JwtUtils.generateToken(userCredentials.getUsername(), roles);
//            return ResponseEntity.ok(token);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
//
//   
//    private boolean isValidCredentials(User userCredentials) {
//        return "user".equals("user") && "password".equals("password");
//    }
//
//    
//    private List<String> getUserRoles(String username) {
//    	// Get roles according to user name
//        return Collections.singletonList("ROLE_USER");
//    }
//}
//
