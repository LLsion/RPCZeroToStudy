package com.chen.RpcDemo01.service.Impl;

import com.chen.RpcDemo01.common.User;
import com.chen.RpcDemo01.service.UserService;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.UUID;

/**
 * @author czn
 * @date 2022/12/6 21:31
 */
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public User getUserByUserId(Integer id) {
        log.debug("客户端查询了"+id+"的用户");
        // 模拟从数据库中取用户的行为
        Random random = new Random();
        User user = User.builder().userName(UUID.randomUUID().toString())
                .id(id)
                .sex(random.nextBoolean()).build();
        return user;

    }
}
