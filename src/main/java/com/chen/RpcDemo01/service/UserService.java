package com.chen.RpcDemo01.service;

import com.chen.RpcDemo01.common.User;

/**
 * @author czn
 * @date 2022/12/6 21:31
 */
public interface UserService {
    User getUserByUserId(Integer id);
}
