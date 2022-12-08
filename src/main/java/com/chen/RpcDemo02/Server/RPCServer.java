package com.chen.RpcDemo02.Server;

import com.chen.RpcDemo02.service.Impl.UserServiceImpl;
import com.chen.RpcDemo02.service.UserService;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author czn
 * @date 2022/12/7 22:23
 */
public class RPCServer {

    //获得消息，执行方法
    UserService userService = new UserServiceImpl();
    ServerSocket serverSocket;

    {
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("服务端启动了");
            //BIO方式监听socket
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
