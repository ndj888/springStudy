package com.jjcbs.service.main;

import com.jjcbs.service.config.AopConfig;
import com.jjcbs.service.impl.DemoAnnotationServiceImpl;
import com.jjcbs.service.impl.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationServiceImpl demoAnnotationService = context.getBean(DemoAnnotationServiceImpl.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
