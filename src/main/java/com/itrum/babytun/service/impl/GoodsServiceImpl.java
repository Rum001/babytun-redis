package com.itrum.babytun.service.impl;

import com.itrum.babytun.dao.GoodsCoverDAO;
import com.itrum.babytun.dao.GoodsDAO;
import com.itrum.babytun.dao.GoodsDetailDAO;
import com.itrum.babytun.dao.GoodsParamDAO;
import com.itrum.babytun.entity.Goods;
import com.itrum.babytun.entity.GoodsCover;
import com.itrum.babytun.entity.GoodsDetail;
import com.itrum.babytun.entity.GoodsParam;
import com.itrum.babytun.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    @SuppressWarnings("all")
    private GoodsDAO goodsDAO;
    @Autowired
    @SuppressWarnings("all")
    private GoodsCoverDAO goodsCoverDAO;
    @Autowired
    @SuppressWarnings("all")
    private GoodsParamDAO goodsParamDAO;
    @Autowired
    @SuppressWarnings("all")
    private GoodsDetailDAO goodsDetailDAO;

    @Cacheable(value = "goods",key = "#goodsId")//缓存的核心注解  goods::2010
    @Override
    public Goods getGoods(Long goodsId) {
        return goodsDAO.findGoodsById(goodsId);
    }

    @Cacheable(value = "covers",key = "#goodsId")
    @Override
    public List<GoodsCover> getCovers(Long goodsId) {
        return goodsCoverDAO.findGoodsCoverByGoodsId(goodsId);
    }

    @Cacheable(value = "details",key = "#goodsId")
    @Override
    public List<GoodsDetail> getDetails(Long goodsId) {
        return goodsDetailDAO.findGoodsDetailByGoodsId(goodsId);
    }

    @Cacheable(value = "params",key = "#goodsId")
    @Override
    public List<GoodsParam> getParams(Long goodsId) {
        return goodsParamDAO.findGoodsParamByGoodsId(goodsId);
    }
}
