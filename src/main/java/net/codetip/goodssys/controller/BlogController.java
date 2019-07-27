package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.Blog;
import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.BlogMapper;
import net.codetip.goodssys.mapper.UserMapper;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogMapper blogMapper;

    @RequestMapping("")
    public String blogindex(Model model){
        List<Blog> blogs = blogMapper.findAll();
        model.addAttribute("blogs",blogs);
        return "blog";
    }

    @RequestMapping("blogList")
    public String blogList(Model model){
        List<Blog> blogs = blogMapper.findAll();
        model.addAttribute("blogs",blogs);
        return "blog_list";
    }

    @RequestMapping("blogAdd")
    public String blogAdd(){
        return "blog_add";
    }


    @RequestMapping("badd")
    @ResponseBody
    public JSONObject bAdd(Blog blog){
        JSONObject result = new JSONObject();
        Subject subject= SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();//获取当前用户
        blog.setCreateTime(new Date());
        blog.setUid(user.getId());
        blogMapper.insert(blog);
        result.put("success",true);
        return result;
    }

}
