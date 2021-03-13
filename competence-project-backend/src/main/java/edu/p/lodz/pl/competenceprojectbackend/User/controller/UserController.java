package edu.p.lodz.pl.competenceprojectbackend.User.controller;

import edu.p.lodz.pl.competenceprojectbackend.Exception.ObjectNotFoundException;
import edu.p.lodz.pl.competenceprojectbackend.User.model.User;
import edu.p.lodz.pl.competenceprojectbackend.User.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable("id") Long id) throws ObjectNotFoundException {
        return userService.getUserById(id);
    }


    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody @Valid Map<String, Object> updates) throws ObjectNotFoundException {
        return userService.updateUser(id, updates);
    }

    @PatchMapping("/update/{id}")
    public User updateUserPartially(@PathVariable("id") Long id, @RequestBody @Valid Map<String, Object> updates) throws ObjectNotFoundException {
        return userService.updateUser(id, updates);
    }
}
