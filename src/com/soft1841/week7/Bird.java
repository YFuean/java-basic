package com.soft1841.week7;

public class Bird extends FlyObject {
    public Bird(String name, double speed){
        //通过super调用父类构造方法
        super(name,speed);
    }
    @Override
    public String fly() {
        return "飞禽名称：" + this.name + ",飞行时速：" + this.speed + "km/h";
    }
}
