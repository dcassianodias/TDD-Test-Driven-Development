package com.danilodias.service;

import com.danilodias.model.User;

public interface UserService {
    User createUser(String firstName, String lastName, String email, String password, String repeatPassword);
}
