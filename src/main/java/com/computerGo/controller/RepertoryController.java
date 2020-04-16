package com.computerGo.controller;

import com.computerGo.pojo.Repertory;
import com.computerGo.service.RepertoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Jared
 * @Data 2020/4/16 15:14
 */
@Controller
@Slf4j
public class RepertoryController {

    @Autowired
    RepertoryService repertoryService;

    /**
     * 修改商品信息
     * @param goods 商品信息
     * @return
     */
    @GetMapping(value = "updGoods")
    public String updGoods(Repertory goods,String packageMessage){
        int i = repertoryService.updRepertoryByRid(goods,packageMessage);
        if (i>0){
            log.info("成功修改商品信息:"+goods);
            return "myShop";
        }else {
            log.info("修改商品信息失败");
            return "error";
        }
    }
}
