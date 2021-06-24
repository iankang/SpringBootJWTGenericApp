package com.tasks_manager.task.payload.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String jwt, Long id, String username, String email, List<String> roles) {
        this.token = jwt;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
