package com.nineday.singleton;

/**
 * Created by nineday on 2018/4/22.
 */
public class Singleton {

    private Singleton (){}

    public static Singleton singleton = new Singleton();

    public static Singleton getSingleton (){
        return singleton;
    }
}
