package com.nineday.singleton;

/**
 * Created by nineday on 2018/4/22.
 *
 * 懒加载模式，但是却存在致命的问题。
 * 当有多个线程并行调用 getInstance() 的时候，就会创建多个实例。
 * 也就是说在多线程下不能正常工作。
 */
public class Singleton1 {

    private  static  Singleton1 singleton ;

    private  Singleton1(){}

    public  static Singleton1 getInstance(){
        if ( singleton == null){
            singleton = new Singleton1();
        }
        return  singleton;
    }
}
