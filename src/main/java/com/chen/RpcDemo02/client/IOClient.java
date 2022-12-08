package com.chen.RpcDemo02.client;

import com.chen.RpcDemo02.common.PRCRequest;
import com.chen.RpcDemo02.common.RPCResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author czn
 * @date 2022/12/7 22:06
 */
public class IOClient {
    public static RPCResponse sendRequest(int port, String host, PRCRequest request)  {

        //BIO方式
        try {
            Socket socket = new Socket(host, port);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            objectOutputStream.writeObject(request);
            objectOutputStream.flush();

            RPCResponse response = (RPCResponse)objectInputStream.readObject();
            return response;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
