package net.codetip.goodssys.mapper;


import net.codetip.goodssys.domain.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {

    @Select("select id,name,price,number,create_time from goods")
    List<Goods> findAll();

    @Delete("delete from goods where id=#{id}")
    void deleteById(int id);
}
