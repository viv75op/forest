package com.dtflys.forest.annotation;

import com.dtflys.forest.lifecycles.logging.LogEnabledLifeCycle;
import com.dtflys.forest.logging.ForestLogHandler;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Forest请求日志处理器注解
 * @author gongjun[dt_flys@hotmail.com]
 * @since 2020-10-13 16:22
 */
@Documented
@MethodLifeCycle(LogEnabledLifeCycle.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LogHandler {

    /**
     * 指定Forest请求日志的处理器类
     */
    Class<? extends ForestLogHandler> value();
}
