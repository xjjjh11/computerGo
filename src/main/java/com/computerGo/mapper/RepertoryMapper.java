package com.computerGo.mapper;

import com.computerGo.pojo.Repertory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @Author Jared
 * @Data 2020/4/16 13:10
 */
@Mapper
public interface RepertoryMapper {

    /**
     * 修改商品信息
     */
    @Update("update repertory set title=#{title},price=#{price},photo=#{photo} where rid=#{rid}")
    int updRepertoryByRid(Repertory goods);

    /**
     * 修改套餐信息
     */
    @Update("update package set packagemessage=#{packageMessage} where pid=#{pid}")
    int updPackageByPid(String packageMessage);
}
