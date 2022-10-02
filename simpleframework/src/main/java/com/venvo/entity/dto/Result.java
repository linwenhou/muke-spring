package com.venvo.entity.dto;

import lombok.Data;

@Data
public class Result<T> {
    //200,表示成功
    private int code;

    //本次请求结果的详情
    private String msg;

    //本次请求返回的结果集
    private T data;

}
