package br.com.example.userapi.services;

import br.com.example.userapi.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
