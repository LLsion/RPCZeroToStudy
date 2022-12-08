package com.chen.RpcDemo01.server;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @author czn
 * @date 2022/12/6 21:29
 */
public class RPCServer {

    //用于处理连接工作
    private EventLoopGroup boss = new NioEventLoopGroup();


    //用于处于数据处理
    private EventLoopGroup work = new NioEventLoopGroup();

}
