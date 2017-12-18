package com.jjcbs.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@Configuration
@ComponentScan("com.jjcbs")
@EnableAspectJAutoProxy
public class AopConfig {

}
