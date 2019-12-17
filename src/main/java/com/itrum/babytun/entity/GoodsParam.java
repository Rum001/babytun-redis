package com.itrum.babytun.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsParam implements Serializable {
    private Integer gpId;
    private Long goodsId;
    private String gpParamName;
    private String gpParamValue;
    private Integer gpOrder;
}
