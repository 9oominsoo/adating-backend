package com.ad.apiserver.controller;

import com.ad.apiserver.domain.Users;
import com.ad.apiserver.dto.UsersSaveRequestDto;
import com.ad.apiserver.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserRepository userRepository;

    //Injection, same as autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping
    public void signUp(@RequestBody UsersSaveRequestDto dto){
        userRepository.save(dto.toEntity());
    }
}
