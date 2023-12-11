package com.spring.registration_form.Service;

import com.spring.registration_form.DTO.UserDTO;
import com.spring.registration_form.Model.User;
import com.spring.registration_form.Repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    PasswordEncoder passwordEncoder;
    private UserRepository userRepository;
    @Override
    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getEmail(), passwordEncoder.encode(userDTO.getPassword()),userDTO.getFullname(),userDTO.getRole());

        return userRepository.save(user);
    }
}
