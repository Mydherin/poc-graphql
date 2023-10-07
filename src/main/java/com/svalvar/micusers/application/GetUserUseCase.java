package com.svalvar.micusers.application;

import com.svalvar.micusers.domain.entitiy.User;
import com.svalvar.micusers.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetUserUseCase {
    private final UserRepository userRepository;

    public User getUserById(final Long id) {
        return userRepository.findById(id);
    }
}
