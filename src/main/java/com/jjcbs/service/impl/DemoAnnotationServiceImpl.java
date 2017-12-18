package com.jjcbs.service.impl;

import com.jjcbs.service.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@Service
public class DemoAnnotationServiceImpl {

    @Action(name = "这里是测试")
    public void add(){}
}
