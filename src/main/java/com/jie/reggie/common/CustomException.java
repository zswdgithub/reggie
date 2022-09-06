package com.jie.reggie.common;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/2 19:59:03
 */

import java.io.StringReader;

/**
 * 自定义业务异常
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }

}
