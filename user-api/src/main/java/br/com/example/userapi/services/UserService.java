package br.com.example.userapi.services;

import br.com.example.userapi.domain.User;

import java.util.List;


public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
