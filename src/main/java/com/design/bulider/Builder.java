package com.design.bulider;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/11 11:06
 */
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();
}
