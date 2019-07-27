package net.codetip.goodssys.mapper;

import net.codetip.goodssys.domain.Ugoods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UGoodsMapper {

    @Select("select * from ugoods")
    List<Ugoods> findAll();

    @Delete("delete from ugoods where id=#{id}")
    void delById(int id);
}
