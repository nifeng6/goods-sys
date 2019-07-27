package net.codetip.goodssys.mapper;


import net.codetip.goodssys.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

public interface UserMapper {

    @Insert("insert into user(username,sex,password,money,phone,address) values(#{username},#{sex},#{password},#{money},#{phone},#{address})")
    void insert(User user);

    @Select("select *from user where username=#{username}")
    User findByName(String username);

    @Select("select id,username,sex,money,phone,address from user")
    List<User> findAll();

    @Delete("delete from user where id=#{id}")
    void delete(int id);

    @Update("update user set money=money-#{price} where id=#{id}")
    void reduce(int id, BigDecimal price);

}
