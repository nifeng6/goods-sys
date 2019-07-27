package net.codetip.goodssys.service.impl;

import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.UserMapper;
import net.codetip.goodssys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }
}
