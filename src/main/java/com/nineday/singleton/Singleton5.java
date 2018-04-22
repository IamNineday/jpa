package com.nineday.singleton;

/**
 * Created by nineday on 2018/4/22.
 * 这种写法如果完美的话，就没必要在啰嗦那么多双检锁的问题了。
 * 缺点是它不是一种懒加载模式（lazy initialization），
 * 单例会在加载类后一开始就被初始化，
 * 即使客户端没有调用 getInstance()方法。
 * 饿汉式的创建方式在一些场景中将无法使用：
 * 譬如 Singleton 实例的创建是依赖参数或者配置文件的，
 * 在 getInstance() 之前必须调用某个方法设置参数给它，
 * 那样这种单例写法就无法使用了。
 *
 */
public class Singleton5 {
    private static final Singleton5 singleton5 = new Singleton5();

    private Singleton5(){}

    public static Singleton5 getInstance(){
        return singleton5;
    }


}
