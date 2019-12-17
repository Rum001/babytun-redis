package com.itrum.babytun.dao;

import com.itrum.babytun.entity.GoodsCover;
import com.itrum.babytun.entity.GoodsParam;

import java.util.List;

public interface GoodsParamDAO {

    List<GoodsParam>findGoodsParamByGoodsId(Long goodsId);
}
