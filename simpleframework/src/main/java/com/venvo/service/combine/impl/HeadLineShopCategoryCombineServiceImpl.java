package com.venvo.service.combine.impl;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.MainPageInfoDTO;
import com.venvo.entity.dto.Result;
import com.venvo.service.combine.HeadLineShopCategoryCombineService;
import com.venvo.service.solo.HeadLineService;
import com.venvo.service.solo.ShopCategoryService;

import java.util.List;

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {

    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    public Result<MainPageInfoDTO> getMainPageInfo() {

        //获取头条列表
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> listResult = headLineService.queryHeadLine(headLine, 1, 4);
        //获取店铺类别列表
        ShopCategory shopCategory = new ShopCategory();
        Result<List<ShopCategory>> listResult1 = shopCategoryService.queryShopCategory(shopCategory, 1, 4);

        //合并两者并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(listResult, listResult1);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> listResult, Result<List<ShopCategory>> listResult1) {

        return null;
    }
}
