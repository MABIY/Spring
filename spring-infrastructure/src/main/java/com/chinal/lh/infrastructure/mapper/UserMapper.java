package com.chinal.lh.infrastructure.mapper;

import com.chinal.lh.domain.data.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by liuhua on 16-6-30.
 */
public interface UserMapper {

        @Select("select * from user WHERE id = #{id}")
        User getUser(@Param("id") long id);

}
