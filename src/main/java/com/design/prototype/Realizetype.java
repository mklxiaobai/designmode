package com.design.prototype;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/10 16:23
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("原型创建成功");
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Realizetype obj1=new Realizetype();
        Realizetype obj2=(Realizetype)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
    }
}
