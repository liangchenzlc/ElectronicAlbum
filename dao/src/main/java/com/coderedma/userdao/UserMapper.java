package com.coderedma.userdao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coderedma.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from c_user")
    List<User> selectByAll();
}
