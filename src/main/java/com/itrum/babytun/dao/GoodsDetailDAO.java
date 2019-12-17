package com.itrum.babytun.dao;

import com.itrum.babytun.entity.GoodsCover;
import com.itrum.babytun.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailDAO {

    List<GoodsDetail>findGoodsDetailByGoodsId(Long goodsId);
}
