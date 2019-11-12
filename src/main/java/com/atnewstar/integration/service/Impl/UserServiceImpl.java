package com.atnewstar.integration.service.Impl;

import com.atnewstar.integration.dao.UserMapper;
import com.atnewstar.integration.entity.User;
import com.atnewstar.integration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xukaikai
 * @date 2019/11/10 22:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
