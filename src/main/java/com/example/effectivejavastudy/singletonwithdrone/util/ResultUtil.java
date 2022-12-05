package com.example.effectivejavastudy.singletonwithdrone.util;


import com.example.effectivejavastudy.singletonwithdrone.model.dto.Result;
import com.example.effectivejavastudy.singletonwithdrone.model.dto.ResultCode;

public class ResultUtil {


    public static Result makeSuccessResult(ResultCode resultCode) {
        Result sr = new Result();
        sr.setMessage(resultCode.getMessage());
        sr.setCode(resultCode.getCode());
        return sr;
    }

}
