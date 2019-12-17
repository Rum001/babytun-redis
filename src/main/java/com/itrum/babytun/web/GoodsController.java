package com.itrum.babytun.web;

import com.itrum.babytun.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class GoodsController {


    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getGoods")
    public String showGoods(Model model, @RequestParam("goodsId")Long goodsId){
        log.info("goodsId:"+goodsId);
        model.addAttribute("goods",goodsService.getGoods(goodsId));
        model.addAttribute("covers",goodsService.getCovers(goodsId));

        model.addAttribute("params",goodsService.getParams(goodsId));
        model.addAttribute("details",goodsService.getDetails(goodsId));
        return "goods";
    }


}
