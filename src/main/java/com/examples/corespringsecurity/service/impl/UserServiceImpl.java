package com.examples.corespringsecurity.service.impl;

import com.examples.corespringsecurity.domain.Account;
import com.examples.corespringsecurity.repository.UserRepository;
import com.examples.corespringsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(Account account) {
        userRepository.save(account);
    }
}
