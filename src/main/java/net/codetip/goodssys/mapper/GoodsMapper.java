package net.codetip.goodssys.mapper;


import net.codetip.goodssys.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsMapper {

    @Select("select id,name,price,number,create_time from goods")
    List<Goods> findAll();

    @Delete("delete from goods where id=#{id}")
    void deleteById(int id);

    @Insert("insert into goods(name,price,number,miaoshu) values(#{name},#{price},#{number},#{miaoshu})")
    void insert(Goods goods);

    @Select("select * from goods where id=#{id}")
    Goods findById(int id);

    @Update("update goods set number=number-1 where id=#{id}")
    void reduce(int id);
}