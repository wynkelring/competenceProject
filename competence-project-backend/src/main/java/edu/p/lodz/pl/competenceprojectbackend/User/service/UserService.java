package edu.p.lodz.pl.competenceprojectbackend.User.service;

import edu.p.lodz.pl.competenceprojectbackend.Exception.ObjectNotFoundException;
import edu.p.lodz.pl.competenceprojectbackend.User.model.User;
import edu.p.lodz.pl.competenceprojectbackend.User.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) throws ObjectNotFoundException {
        return userRepository.findById(id).orElseThrow(ObjectNotFoundException::new);
    }

    @Override
    public User updateUser(Long id, Map<String, Object> updates) throws ObjectNotFoundException {
        User user = userRepository.findById(id).orElseThrow(ObjectNotFoundException::new);
        if (updates.containsKey("firstName")) user.setFirstName(updates.get("firstName").toString());
        if (updates.containsKey("lastName")) user.setLastName(updates.get("lastName").toString());
        if (updates.containsKey("email")) user.setEmail(updates.get("email").toString());
        if (updates.containsKey("phoneNumber")) user.setPhoneNumber(updates.get("phoneNumber").toString());
        return userRepository.save(user);
    }
}
