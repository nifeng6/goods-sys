package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.Goods;
import net.codetip.goodssys.domain.Ugoods;
import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.GoodsMapper;
import net.codetip.goodssys.mapper.UGoodsMapper;
import net.codetip.goodssys.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UGoodsMapper uGoodsMapper;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/memberList")
    public String merberList(Model model){
        List<User> users = userMapper.findAll();
        model.addAttribute("users",users);
        return "member-list";
    }

    @RequestMapping("/orderList")
    public String orderList(Model model){
        Subject subject= SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();//获取当前用户
        List<Ugoods> ugoodses = uGoodsMapper.findAll(user.getId());
        model.addAttribute("ugoodses",ugoodses);
        return "order-list";
    }

    @RequestMapping("/orderList1")
    public String orderList1(Model model){
        List<Goods> goodses = goodsMapper.findAll();
        model.addAttribute("goodses",goodses);
        return "order-list1";
    }




}
