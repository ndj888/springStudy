package com.jjcbs.service.config;

import com.jjcbs.service.impl.FunctionService;
import com.jjcbs.service.impl.NumberServiceImpl;
import com.jjcbs.service.impl.UserFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@Configuration
public class FunctionConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService(){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }

    @Bean
    public NumberServiceImpl numberService(){
        NumberServiceImpl numberService = new NumberServiceImpl();
        return numberService;
    }
}
