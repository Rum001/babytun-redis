package com.itrum.babytun.dao;

import com.itrum.babytun.entity.GoodsCover;

import java.util.List;

public interface GoodsCoverDAO {

    List<GoodsCover>findGoodsCoverByGoodsId(Long goodsId);
}
