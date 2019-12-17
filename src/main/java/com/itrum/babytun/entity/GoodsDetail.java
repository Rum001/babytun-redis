package com.itrum.babytun.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsDetail implements Serializable {
    private Integer gdId;
    private Long goodsId;
    private String gdPicUrl;
    private String gdThumbUrl;
    private Integer gdOrder;
}
