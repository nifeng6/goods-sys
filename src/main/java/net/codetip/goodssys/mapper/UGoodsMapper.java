package net.codetip.goodssys.mapper;

import net.codetip.goodssys.domain.Ugoods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UGoodsMapper {

    @Select("select * from ugoods where uid=#{id}")
    List<Ugoods> findAll(int id);

    @Delete("delete from ugoods where id=#{id}")
    void delById(int id);

    @Insert("insert into ugoods(user,goods,address,phone,price,date_time,uid) values(#{user},#{goods},#{address},#{phone},#{price},#{dateTime},#{uid})")
    void insert(Ugoods ugoods);
}
