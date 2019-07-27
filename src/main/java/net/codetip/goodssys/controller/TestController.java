package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.BlogMapper;
import net.codetip.goodssys.mapper.GoodsMapper;
import net.codetip.goodssys.mapper.UserMapper;
import net.codetip.goodssys.service.UserService;
import net.codetip.goodssys.util.CryptographyUtil;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class TestController {

//    @Autowired
//    private UserMapper userMapper;
//    @RequestMapping("test")
//    @ResponseBody
//    public String test(@Valid User user){
//        user.setPassword(CryptographyUtil.md5(user.getPassword(),"java"));
//        userMapper.insert(user);
//        return "success";
//    }

//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/test")
//    @ResponseBody
//    public Object test(){
//
//        return userService.findByName("d");
//    }


//    @RequestMapping("test")
//    @ResponseBody
//    public String test(Model model){
//        Subject subject = SecurityUtils.getSubject();
//        User user = (User)subject.getPrincipal();
//
//        return user.getUsername();
//    }


    //获取当前登录的用户

//        @RequestMapping(value = "/test", method = RequestMethod.GET)
//        @ResponseBody
//        public Object currentUserName() {
//            Subject subject= SecurityUtils.getSubject();
//            User user = (User)subject.getPrincipal();
//            return user;
//        }
//

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private BlogMapper blogMapper;


        @RequestMapping("test")
        @ResponseBody
        public Object test(){

            return blogMapper.findAll();
        }




}