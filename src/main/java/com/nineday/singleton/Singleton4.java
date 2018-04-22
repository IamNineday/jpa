package com.nineday.singleton;

/**
 * Created by nineday on 2018/4/22.
 * 使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化。
 * 也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），
 * 读操作不会被重排序到内存屏障之前。
 * 比如上面的例子，取操作必须在执行完 1-2-3 之后或者 1-3-2 之后，
 * 不存在执行到 1-3 然后取到值的情况。
 * 从「先行发生原则」的角度理解的话，
 * 就是对于一个 volatile 变量的写操作都先行发生于后面对这个变量的读操作（这里的“后面”是时间上的先后顺序）。
 */
public class Singleton4 {

    private static volatile Singleton4 singleton4;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(singleton4 == null ){
            synchronized (Singleton4.class){
                singleton4 =new Singleton4();
            }
        }
        return singleton4;
    }
}
