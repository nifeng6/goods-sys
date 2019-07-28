package net.codetip.goodssys.mapper;

import net.codetip.goodssys.domain.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface BlogMapper {

    @Select("select * from blog")
    List<Blog> findAll();

    @Insert("insert into blog(title,content,uid,create_time,label,author) values(#{title},#{content},#{uid},#{createTime},#{label},#{author})")
    void insert(Blog blog);

    @Select("select * from blog where id=#{id}")
    Blog findById(int id);
}
