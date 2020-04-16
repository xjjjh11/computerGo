package com.computerGo.service;

import com.computerGo.pojo.Repertory;

/**
 * @Author Jared
 * @Data 2020/4/16 15:10
 */
public interface RepertoryService {

    /**
     * 修改商品信息
     * @param goods 商品信息
     * @return
     */
    int updRepertoryByRid(Repertory goods,String packageMessage);
}
