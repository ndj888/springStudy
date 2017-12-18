package com.jjcbs.service.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@Documented
public @interface Action {
    String name();
}
