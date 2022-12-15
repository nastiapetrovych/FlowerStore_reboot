package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {
    public final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public void addUser(AppUser user){
        Optional<AppUser> foundUser = appUserRepository.findAllById(user.getEmail());
        if (foundUser.isPresent()){
            System.out.println("The user already exist");
        }
        else {
            appUserRepository.save(user);
        }
    }
    public List<AppUser> getUsers(){
        return appUserRepository.findAll();
    }
}
