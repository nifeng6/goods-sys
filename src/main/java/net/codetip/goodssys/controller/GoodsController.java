package net.codetip.goodssys.controller;

import net.codetip.goodssys.mapper.GoodsMapper;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsMapper goodsMapper;

    @RequestMapping("/orderAdd")
    public String orderAdd(){
        return "order-add";
    }

    @RequestMapping("/goodsAdd")
    public String goodsAdd(){
        return "goods_add";
    }

    @RequestMapping("/goodsdel")
    @ResponseBody
    public JSONObject goodsdel(int id){
        JSONObject result = new JSONObject();
        goodsMapper.deleteById(id);
        result.put("success",true);
        return result;
    }
}
