package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.UserMapper;
import net.codetip.goodssys.service.UserService;
import net.codetip.goodssys.util.CryptographyUtil;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("login")
    @ResponseBody
    public JSONObject test(String username,String password){
        JSONObject result = new JSONObject();
        //获取 subject
        Subject subject= SecurityUtils.getSubject();
        //封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(username, CryptographyUtil.md5(password, "java"));
        try {
            //执行登陆  shiro的登陆
            subject.login(token);
            //执行登陆  shiro的登陆

            result.put("success", true);
            result.put("msg","登陆成功");
            User user = userService.findByName(username);
            SecurityUtils.getSubject().getSession().setAttribute("currentUser", user); //把当前用户信息存到session中
        } catch (UnknownAccountException e) {
            result.put("success", false);
            result.put("msg","用户名不存在");
        }catch (IncorrectCredentialsException e) {
            result.put("success", false);
            result.put("msg","密码错误");
        }

        return result;
    }

    @RequestMapping("memberAdd")
    public String orderAdd(){
        return "memberadd";
    }

    @RequestMapping("useradd")
    @ResponseBody
    public JSONObject userAdd(@Valid User user){
        JSONObject result = new JSONObject();
        user.setPassword(CryptographyUtil.md5(user.getPassword(),"java"));
        userMapper.insert(user);
        result.put("success",true);
        return result;
    }

    @RequestMapping("userdel")
    @ResponseBody
    public JSONObject deluser(int id){
        JSONObject redel = new JSONObject();
        userMapper.delete(id);
        redel.put("success",true);
        return redel;
    }



}
