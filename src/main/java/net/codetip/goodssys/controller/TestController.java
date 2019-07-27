package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.UserMapper;
import net.codetip.goodssys.service.UserService;
import net.codetip.goodssys.util.CryptographyUtil;
import net.sf.json.JSONObject;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

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

}
