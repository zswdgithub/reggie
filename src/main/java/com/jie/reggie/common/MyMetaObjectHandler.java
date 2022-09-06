package com.jie.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/9/1 15:52:39
 */

/**
 * 自定义元数据对象处理器
 */
@Component //一定不要忘记把处理器加入IOC容器中
public class MyMetaObjectHandler implements MetaObjectHandler{

    //插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
//        this.setFieldValByName("createTime", LocalDateTime.class,metaObject);
        metaObject.setValue("createTime",LocalDateTime.now());
        metaObject.setValue("updateTime",LocalDateTime.now());
//        this.setFieldValByName("updateTime",LocalDateTime.class,metaObject);
        metaObject.setValue("createUser",BaseContext.getCurrentId());
        metaObject.setValue("updateUser",BaseContext.getCurrentId());
    }
    //更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("updateTime",LocalDateTime.class,metaObject);
        metaObject.setValue("updateTime",LocalDateTime.now());
        metaObject.setValue("updateUser",BaseContext.getCurrentId());
    }
}
