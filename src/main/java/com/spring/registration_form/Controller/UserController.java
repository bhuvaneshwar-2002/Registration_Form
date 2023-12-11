package com.spring.registration_form.Controller;

import com.spring.registration_form.DTO.UserDTO;
import com.spring.registration_form.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    private UserService userService;

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user")UserDTO userDTO){
        return "register";
    }
}
