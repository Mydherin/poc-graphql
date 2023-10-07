package com.svalvar.micusers.infrastructure.repository;

import com.svalvar.micusers.domain.entitiy.Job;
import com.svalvar.micusers.domain.entitiy.User;
import com.svalvar.micusers.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class UserRepositoryImpl implements UserRepository {
    public User findById(final Long id) {
        return Stream.of(
                        User.builder()
                                .id(1L)
                                .name("Helen")
                                .job(Job.builder()
                                        .id(1L)
                                        .title("Software Engineer")
                                        .enterprise("Orchestra")
                                        .build())
                                .build(),
                        User.builder()
                                .id(2L)
                                .name("Andres")
                                .job(Job.builder()
                                        .id(1L)
                                        .title("Software Engineer")
                                        .enterprise("Orchestra")
                                        .build())
                                .build(),
                        User.builder()
                                .id(3L)
                                .name("Jesus")
                                .job(Job.builder()
                                        .id(2L)
                                        .title("Senior Backend Developer")
                                        .enterprise("Inditex")
                                        .build())
                                .build()
                )
                .filter(user -> user.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
