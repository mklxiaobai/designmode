package com.design.bulider;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/11 11:07
 */
public class MobikeBuilder extends Builder{
    private Bike mBike = new Bike();
    @Override
    void buildFrame() {
        mBike.setFrame("sss");
    }
    @Override
    void buildSeat() {
        mBike.setSeat("sss");
    }
    @Override
    void buildTire() {
        mBike.setTire("sss");
    }
    @Override
    Bike createBike() {
        return mBike;
    }
}
