package com.atnewstar.integration.controller;

import com.atnewstar.integration.dao.UserMapper;
import com.atnewstar.integration.entity.User;
import com.atnewstar.integration.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Xukaikai
 * @date 2019/11/10 22:08
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
