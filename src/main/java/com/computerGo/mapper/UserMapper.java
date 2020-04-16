package com.computerGo.mapper;

import com.computerGo.pojo.Identity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author Jared
 * @Data 2020/4/15 22:42
 */
@Mapper
public interface UserMapper {

    //该用户添加收货地址
    @Insert("insert into identity (iid,uname,uphone,uaddress,uid) values " +
            "   (default,#{uname},#{uphone},#{uaddress},#{uid})")
    int insDeliveryAddress(Identity address);
    //删除该用户的收货地址
    @Delete("delete from identity where uid=#{uid} and uname=#{uname}" +
                "and uphone=#{uphone} and uaddress=#{uaddress}")
    int delAddressByUid(Identity address);
    //显示收货地址
    @Select("select uname,uphone,uaddress from identity where uid=#{uid}")
    List<Identity> selAddressByUid(int uid);


}
