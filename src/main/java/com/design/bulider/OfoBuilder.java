package com.design.bulider;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/11 11:07
 */
public class OfoBuilder extends Builder{
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame("ddd");
    }
    @Override
    void buildSeat() {
        mBike.setSeat("ddd");
    }
    @Override
    void buildTire() {
        mBike.setTire("ddd");
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
