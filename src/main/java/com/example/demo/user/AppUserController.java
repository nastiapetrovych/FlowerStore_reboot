package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class AppUserController {
    private final AppUserService userService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.userService = appUserService;
    }

    @GetMapping
    public  List<AppUser> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void addFlower(@RequestBody AppUser user){
        userService.addUser(user);
    }
}
