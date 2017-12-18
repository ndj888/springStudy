package com.jjcbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
@Service
public class UserFunctionService {
    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHellow(String word){
        return functionService.sayHellow(word);
    }
}
