package com.computerGo.mapper;

import com.computerGo.pojo.Identity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Jared
 * @Data 2020/4/15 22:42
 */
@Mapper
public interface IdentityMapper {

    //商户注册
    @Insert("insert into identity values (default,#{uname},#{uphone},#{uidcard},#{uaddress})")
    int insIdentity(Identity identity);

}
