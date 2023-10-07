package com.svalvar.micusers.domain.repository;

import com.svalvar.micusers.domain.entitiy.User;

public interface UserRepository {
    User findById(final Long id);
}
