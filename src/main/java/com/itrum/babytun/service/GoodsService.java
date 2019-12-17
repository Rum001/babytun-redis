package com.itrum.babytun.service;

import com.itrum.babytun.entity.Goods;
import com.itrum.babytun.entity.GoodsCover;
import com.itrum.babytun.entity.GoodsDetail;
import com.itrum.babytun.entity.GoodsParam;

import java.util.List;

public interface GoodsService {

    Goods getGoods(Long goodsId);

    List<GoodsCover>getCovers(Long goodsId);

    List<GoodsDetail>getDetails(Long goodsId);

    List<GoodsParam>getParams(Long goodsId);
}
