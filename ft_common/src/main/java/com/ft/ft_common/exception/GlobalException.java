package com.ft.ft_common.exception;

import com.ft.ft_common.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * @author: 一枚方糖
 */

@ControllerAdvice
public class GlobalException {

    // 此处可以添加其他异常处理

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response error(Exception e) {
        e.printStackTrace();
        return Response.error().message("请求异常，请稍后再试！");
    }
}
