package com.chen.RpcDemo01.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author czn
 * @date 2022/12/6 21:30
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //服务端和客户端交互的消息对象
    private Integer id;
    private String userName;
    private Boolean sex;
}
