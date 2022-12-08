package com.chen.RpcDemo02.common;

import lombok.Builder;

import java.io.Serializable;

/**
 * @author czn
 * @date 2022/12/7 20:50
 */

//客户端向服务端发送一个请求，希望调用服务端的一个方法
//需要向服务端发送调用的接口名、方法名、参数和参数类型
//本质上使用了反射的机制，jdk'的动态代理
//这个类需要序列化以传输通信
@Builder
public class PRCRequest implements Serializable {
    //接口名称
    private String interfaceName;
    //方法名称
    private String methodName;
    //参数
    private Object[] params;
    //参数类型，用泛型指定
    private Class<?>[] paramsType;
    //上述全都是jdk动态代理中所需要的参数
}
