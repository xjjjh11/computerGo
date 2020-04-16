package com.computerGo.pojo;

import lombok.Data;

/**
 * @Author Jared
 * @Data 2020/4/15 22:34
 */
@Data
public class Identity {
    private int id;
    private String uname;   //用户名称
    private String uphone;  //用户手机号
    private String uidcard; //用户身份证
    private String uaddress;//用户详细地址
    private int uid;        //用户id
}
