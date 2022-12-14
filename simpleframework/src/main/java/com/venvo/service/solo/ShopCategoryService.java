package com.venvo.service.solo;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.bo.ShopCategory;
import com.venvo.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {

    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<ShopCategory> queryShopCategoryById(int shopCategoryId);

    Result<List<ShopCategory>> queryShopCategory(ShopCategory shopCategory, int pageIndex, int pageSize);

}
