package com.computerGo.service.serviceImpl;

import com.computerGo.mapper.IdentityMapper;
import com.computerGo.mapper.UserMapper;
import com.computerGo.pojo.Identity;
import com.computerGo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Jared
 * @Data 2020/4/15 22:40
 */
@Service
public class IdentityServiceImpl implements IdentityService {

    @Autowired
    IdentityMapper identityMapper;

    /**
     * 商户注册
     * @param identity 商户信息
     * @return
     */
    @Override
    public int insIdentity(Identity identity) {
        return identityMapper.insIdentity(identity);
    }

}
