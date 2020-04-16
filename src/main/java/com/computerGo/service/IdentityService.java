package com.computerGo.service;

import com.computerGo.pojo.Identity;

/**
 * @Author Jared
 * @Data 2020/4/15 22:38
 */
public interface IdentityService {

    /**
     * 插入商户信息
     * @param identity 商户信息
     * @return
     */
    int insIdentity(Identity identity);

}
