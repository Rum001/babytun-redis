package com.itrum.babytun.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsCover implements Serializable {
    private Integer gcId;
    private Long goodsId;
    private String gcPicUrl;
    private String gcThumbUrl;
    private Integer gcOrder;
}
