package com.jjcbs.service.main;

import com.jjcbs.service.config.FunctionConfig;
import com.jjcbs.service.impl.NumberServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@ComponentScan(value = "com.jjcbs")
public class NumberMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);
        NumberServiceImpl numberService = context.getBean(NumberServiceImpl.class);
        System.out.println(numberService.getMax(5, 8));
        context.close();
    }
}
