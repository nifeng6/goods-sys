package net.codetip.goodssys.controller;

import net.codetip.goodssys.domain.Ugoods;
import net.codetip.goodssys.mapper.UGoodsMapper;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("ugoods")
public class UGoodsController {
    @Autowired
    private UGoodsMapper uGoodsMapper;

    @RequestMapping("ugdel")
    @ResponseBody
    public JSONObject ugdel(int id){
        JSONObject result = new JSONObject();
        uGoodsMapper.delById(id);
        result.put("success",true);
        return result;
    }
}
