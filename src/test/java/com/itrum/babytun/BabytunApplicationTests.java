package com.itrum.babytun;

import com.itrum.babytun.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BabytunApplicationTests {

    @Autowired
    private GoodsService goodsService;
    @Test
    void contextLoads() {
        System.out.println(goodsService.getGoods(1474L));
        goodsService.getCovers(1474L).forEach(c-> System.out.println(c));
       goodsService.getParams(1474L).forEach(c-> System.out.println(c));;
        goodsService.getDetails(1474L).forEach(c-> System.out.println(c));;

    }

}
