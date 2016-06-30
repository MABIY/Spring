package com.chinal.lh.infrastructure.repository;

import com.chinal.lh.domain.Repository.UserRepository;
import com.chinal.lh.domain.data.User;
import com.chinal.lh.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by liuhua on 16-6-30.
 */
@Repository
public class UserMybatisRepository implements UserRepository {
    @Autowired
    UserMapper userMapper;

    public User find(long id) {
        return userMapper.getUser(id);
    }
}
