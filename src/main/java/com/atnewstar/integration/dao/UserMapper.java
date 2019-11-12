package com.atnewstar.integration.dao;

import com.atnewstar.integration.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Xukaikai
 * @date 2019/11/10 22:10
 */
@Mapper
public interface UserMapper {
    public List<User> getAll();
}
