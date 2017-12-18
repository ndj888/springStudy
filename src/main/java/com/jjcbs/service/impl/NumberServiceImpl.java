package com.jjcbs.service.impl;

/**
 * Created by Administrator on 2017/12/18 0018.
 *
 * @author jjc
 */
public class NumberServiceImpl {

    public String getMax(int a , int b){
        int max =  a > b ? a : b;
        return "最大的数值是：" + String.valueOf(max);
    }
}
