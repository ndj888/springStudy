package com.jjcbs.service.main;

import com.jjcbs.service.config.FunctionConfig;
import com.jjcbs.service.impl.UserFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@ComponentScan(value = "com.jjcbs")
public class FunctionMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FunctionConfig.class);
        UserFunctionService userFunctionService = context.getBean(UserFunctionService.class);
        System.out.println(userFunctionService.sayHellow("hellow"));
        context.close();
    }
}
