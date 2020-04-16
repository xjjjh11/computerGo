package com.computerGo.service.serviceImpl;

import com.computerGo.mapper.RepertoryMapper;
import com.computerGo.pojo.Repertory;
import com.computerGo.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Jared
 * @Data 2020/4/16 15:10
 */
@Service
public class RepertoryServiceImpl implements RepertoryService {

    @Autowired
    RepertoryMapper repertoryMapper;

    /**
     * 修改商品信息
     * @param goods 商品信息
     * @return
     */
    @Override
    public int updRepertoryByRid(Repertory goods,String packageMessage) {
        int i = repertoryMapper.updPackageByPid(packageMessage);
        int j = repertoryMapper.updRepertoryByRid(goods);
        if (i>0&&j>0) return j;
        else return -1;

    }
}
