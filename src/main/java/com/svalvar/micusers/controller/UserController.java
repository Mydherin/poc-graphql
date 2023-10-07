package com.svalvar.micusers.controller;

import com.svalvar.micusers.application.GetUserUseCase;
import com.svalvar.micusers.domain.entitiy.User;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {
    private final GetUserUseCase getUserUseCase;

    @QueryMapping
    public User userById(@Argument final Long id) {
        return getUserUseCase.getUserById(id);
    }
}
