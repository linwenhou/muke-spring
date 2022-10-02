package com.venvo.controller.superadmin;

import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.Result;
import com.venvo.service.solo.ShopCategoryService;

import java.util.List;

public class ShopCategoryOperationController {
    private ShopCategoryService shopCategoryService;


    Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    Result<Boolean> removeShopCategory(int shopCategoryId) {
        return shopCategoryService.removeShopCategory(1);
    }

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return shopCategoryService.removeShopCategory(1);
    }

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId) {
        return shopCategoryService.queryShopCategoryById(1);
    }

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, int pageIndex, int pageSize) {
        return shopCategoryService.queryShopCategory(new ShopCategory(), 1, 10);
    }

}
