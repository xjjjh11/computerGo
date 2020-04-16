package com.computerGo.service;

import com.computerGo.pojo.Identity;

import java.util.List;

/**
 * @Author Jared
 * @Data 2020/4/15 22:24
 */
public interface UserService {

    /**
     * 添加收货地址
     * @param address 收货地址
     * @return
     */
    int insDeliveryAddress(Identity address);

    /**
     * 删除该用户的收货地址
     * @param address 收货地址
     * @return
     */
    int delAddressByUid(Identity address);

    /**
     * 显示用户收货地址
     * @param uid 用户id
     * @return
     */
    List<Identity> selAddressByUid(int uid);
}
