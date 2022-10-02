package com.venvo.entity.dto;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineLIst;
    private List<ShopCategory> shopCategoryList;
}
