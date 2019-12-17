package com.itrum.babytun.dao;

import com.itrum.babytun.entity.Goods;

public interface GoodsDAO {

    Goods findGoodsById(Long goodsId);
}
