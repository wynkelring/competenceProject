package edu.p.lodz.pl.competenceprojectbackend.User.service;

import edu.p.lodz.pl.competenceprojectbackend.Exception.ObjectNotFoundException;
import edu.p.lodz.pl.competenceprojectbackend.User.model.User;

import java.util.Map;

public interface IUserService {
    User getUserById(Long id) throws ObjectNotFoundException;

    User updateUser(Long id, Map<String, Object> updates) throws ObjectNotFoundException;
}
