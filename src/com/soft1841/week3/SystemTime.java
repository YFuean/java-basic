package com.soft1841.week3;

import java.time.LocalTime;

/**
 * 和系统同步的事件，到秒级
 * 2018.10.24
 */
public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        //通过time的API指定一个未来的时间
        LocalTime endTime = LocalTime.of(8,40,0);
        while (true) {
            //使用JDK8的时间API,，获取当前系统时间，去掉毫秒
            LocalTime currentTime = LocalTime.now().withNano(0);
            Thread.sleep(1000);
            System.out.println(currentTime);
            //当前时间超过了指定时间
            if (currentTime.isAfter(endTime)){
                break;
            }
        }
        System.out.println("时间到");
    }
}
