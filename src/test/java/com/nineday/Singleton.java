package com.nineday;

/**
 * Created by nineday on 2018/4/22.
 * 实现单例模式
 */
public class Singleton {

    private Singleton(){
    }

    public static Singleton  singleton = null;

    public synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return  singleton;

    }











}
