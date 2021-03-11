package com.example.CompetenceProject.User.service;

import com.example.CompetenceProject.Exception.ObjectNotFoundException;
import com.example.CompetenceProject.User.model.User;

import java.util.Map;

public interface IUserService {
    User getUserById(Long id) throws ObjectNotFoundException;

    User updateUser(Long id, Map<String, Object> updates) throws ObjectNotFoundException;
}
