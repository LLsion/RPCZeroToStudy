package com.chen.RpcDemo02.client;

import com.chen.RpcDemo02.common.User;
import com.chen.RpcDemo02.service.UserService;

/**
 * @author czn
 * @date 2022/12/7 21:21
 */
//客户端向服务端发送服务调用的请求
public class RPCClient {
    public static void main(String[] args) {
        //创建代理类，
        ClientProxy clientProxy = new ClientProxy(8080, "localhost");
        UserService proxy = clientProxy.getProxy(UserService.class);

        User userByUserId = proxy.getUserByUserId(10);
        System.out.println("从服务端获取的user对象" + userByUserId);


    }
}
