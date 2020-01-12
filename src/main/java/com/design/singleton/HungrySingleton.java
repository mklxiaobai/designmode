package com.design.singleton;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/10 16:07
 * 饿汉式
 */
public class HungrySingleton {
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
