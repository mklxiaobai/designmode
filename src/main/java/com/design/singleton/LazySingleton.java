package com.design.singleton;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/10 16:01
 * 懒汉式
 */
public class LazySingleton {
    private static volatile LazySingleton instance=null;    //保证 instance 在所有线程中同步
    private LazySingleton(){}    //private 避免类在外部被实例化
    public static synchronized LazySingleton getInstance()  //加锁确保初次创建对象唯一
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }
}
