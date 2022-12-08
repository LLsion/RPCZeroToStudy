package com.chen.RpcDemo02.service;

import com.chen.RpcDemo02.common.User;

/**
 * @author czn
 * @date 2022/12/7 21:23
 */
public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    User getUserByUserId(Integer id);
    // 给这个服务增加一个功能
    Integer insertUserId(User user);
}
