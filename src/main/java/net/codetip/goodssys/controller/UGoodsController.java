package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.Goods;
import net.codetip.goodssys.domain.Ugoods;
import net.codetip.goodssys.domain.User;
import net.codetip.goodssys.mapper.GoodsMapper;
import net.codetip.goodssys.mapper.UGoodsMapper;
import net.codetip.goodssys.mapper.UserMapper;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("ugoods")
public class UGoodsController {
    @Autowired
    private UGoodsMapper uGoodsMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("ugdel")
    @ResponseBody
    public JSONObject ugdel(int id){
        JSONObject result = new JSONObject();
        uGoodsMapper.delById(id);
        result.put("success",true);
        return result;
    }

    @RequestMapping("mai")
    @ResponseBody
    public JSONObject mai(int id){//这里获取的id是商品的id
        JSONObject result = new JSONObject();
        Subject subject= SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();//获取当前用户
        Goods goods =  goodsMapper.findById(id);
        Ugoods ugoods = new Ugoods();
//👇👇👇👇👇👇👇其实可以封装到service中更美观，更可视化，谁叫我懒🙃👇👇👇👇👇👇👇👇👇👇👇
        ugoods.setAddress(user.getAddress());
        ugoods.setDateTime(new Date());
        ugoods.setPhone(user.getPhone());
        ugoods.setGoods(goods.getName());
        ugoods.setUid(user.getId());
        ugoods.setPrice(goods.getPrice());
        ugoods.setUser(user.getUsername());
        userMapper.reduce(user.getId(),goods.getPrice());//同时减少用户表中的金额
        goodsMapper.reduce(goods.getId());//同时这里要减少库存
//👆👆👆👆👆👆👆其实可以封装到service中更美观，更可视化，谁叫我懒🙃👆👆👆👆👆👆👆👆👆👆👆
        uGoodsMapper.insert(ugoods);
        result.put("success",true);
        return result;
    }

}
