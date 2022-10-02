package com.venvo.controller.superadmin;

import com.venvo.entity.bo.HeadLine;
import com.venvo.entity.dto.Result;
import com.venvo.service.solo.HeadLineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class HeadLineOperationController {
    private HeadLineService headLineService;

    public Result<Boolean> addHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.addHeadLine(new HeadLine());
    }

    Result<Boolean> removeHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.removeHeadLine(1);
    }

    Result<Boolean> modifyHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.modifyHeadLine(new HeadLine());
    }

    Result<HeadLine> queryHeadLineById(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.queryHeadLineById(1);

    }

    Result<List<HeadLine>> queryHeadLine(HttpServletRequest req, HttpServletResponse response) {
        return headLineService.queryHeadLine(null, 1, 100);
    }

}
