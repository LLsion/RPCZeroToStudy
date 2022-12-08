package com.chen.RpcDemo02.client;

import com.chen.RpcDemo02.common.PRCRequest;
import com.chen.RpcDemo02.common.RPCResponse;
import com.chen.RpcDemo02.service.UserService;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author czn
 * @date 2022/12/7 21:25
 */
@AllArgsConstructor
public class ClientProxy implements InvocationHandler {
    private int port;

    private String host;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理，执行此方法时会增强方法
        PRCRequest request = PRCRequest.builder().interfaceName(method.getDeclaringClass().getName())
                .methodName(method.getName())
                .params(args).paramsType(method.getExceptionTypes()).build();
        //将请求发往客户端,返回一个RPCResponse，向客户端发送端口号、主机号和request
        RPCResponse response = IOClient.sendRequest(port, host, request);

        //从RPCResponse中获取数据返回给客户端
        return response.getData();
    }
    //获取代理类
    public <T> T getProxy(Class<T> clazz) {
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, this);
        return (T)o;
    }
}
