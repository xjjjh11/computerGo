package com.computerGo.service.serviceImpl;

import com.computerGo.mapper.UserMapper;
import com.computerGo.pojo.Identity;
import com.computerGo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Jared
 * @Data 2020/4/16 8:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 添加该用户的收货地址
     * @param address 收货地址
     * @return
     */
    @Override
    public int insDeliveryAddress(Identity address) {
        return userMapper.insDeliveryAddress(address);
    }

    /**
     * 删除该用户的收货地址
     * @param address 收货地址
     * @return
     */
    @Override
    public int delAddressByUid(Identity address) {
        return userMapper.delAddressByUid(address);
    }

    /**
     * 显示用户收货地址
     * @param uid 用户id
     * @return
     */
    @Override
    public List<Identity> selAddressByUid(int uid) {
        return userMapper.selAddressByUid(uid);
    }
}
