package com.design.bulider;

/**
 * @author 马锴梁
 * @version 1.0
 * @date 2020/1/11 11:08
 */
public class Director {
    private Builder mBuilder = null;
    public Director(Builder builder) {
        mBuilder = builder;
    }
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        mBuilder.buildTire();
        return mBuilder.createBike();
    }

//    public void showBike(Builder builder) {
//        Director director = new Director(builder);
//        Bike bike = director.construct();
//        bike.getFrame();
//        bike.getSeat();
//        bike.getTire();
//    }
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame();
        bike.getSeat();
        bike.getTire();
    }
}
