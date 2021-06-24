package com.tasks_manager.task.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;
}
