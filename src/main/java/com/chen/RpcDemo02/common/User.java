package com.chen.RpcDemo02.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author czn
 * @date 2022/12/7 21:24
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    //也需要能够序列化
    private int id;
    private String userName;
    private Boolean sex;
}
