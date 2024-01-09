package com.jipescu.garden.service.user;

import com.jipescu.garden.model.UserData;
import com.jipescu.garden.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserData register(UserData userData) {
        return userRepository.save(userData);
    }
}
