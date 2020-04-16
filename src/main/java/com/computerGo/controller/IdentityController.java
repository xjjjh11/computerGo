package com.computerGo.controller;

import com.computerGo.pojo.Identity;
import com.computerGo.service.IdentityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author Jared
 * @Data 2020/4/15 22:50
 */
@Slf4j
@Controller
public class IdentityController {

    @Autowired
    IdentityService identityService;

    /**
     * 商户注册
     * @param identity 商户信息
     * @return
     */
    @GetMapping(value = "register")
    public String register(Identity identity){
        int i = identityService.insIdentity(identity);
        if (i > 0) {
            log.info("商户注册成功");
            return "myShop";
        }else {
            log.info("注册失败");
            return "error";
        }
    }


}
