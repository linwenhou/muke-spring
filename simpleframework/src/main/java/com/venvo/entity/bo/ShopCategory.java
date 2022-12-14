package com.venvo.entity.bo;

import lombok.Data;

import java.util.Date;

@Data
public class ShopCategory {

    private Integer shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;

    private Integer priority;
    private Date createTime;
    private Date lasEditTime;
    private ShopCategory parent;
}
