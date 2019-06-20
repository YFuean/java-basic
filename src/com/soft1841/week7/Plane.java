package com.soft1841.week7;

/**
 * 飞机类，继承FlyObject抽象类
 */


public class Plane extends FlyObject {
    public Plane(String name, double speed){
        //通过super调用父类构造方法
        super(name,speed);
    }


    @Override
    public String fly() {
        return "飞机型号：" + this.name + ",飞行时速：" + this.speed + "km/m";
    }
}
