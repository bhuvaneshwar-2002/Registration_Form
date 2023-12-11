package com.spring.registration_form.Service;

import com.spring.registration_form.DTO.UserDTO;
import com.spring.registration_form.Model.User;

public interface UserService {
    User save(UserDTO userDTO);
}
