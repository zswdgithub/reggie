package com.jie.reggie.common;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/2 12:35:30
 */

/**
 * 基于Thread封装工具类，用户保存和获取当前登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    public static Long getCurrentId(){
        return threadLocal.get();
    }

}
