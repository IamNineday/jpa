package com.nineday.singleton;

/**
 * Created by nineday on 2018/4/22.
 */
public class Singleton6 {

    private static int s = 0;
    private Singleton6(){
        System.out.println("Singleton");
    }



    private static class CreateInstance{

        private static final Singleton6 SINGLETON_6 = new Singleton6();
    }

    public static final Singleton6 getInstance(int t){
        //do setting
        s = t;
        System.out.println("start");

        return CreateInstance.SINGLETON_6;

    }


    public static void main(String[] args) {
        Singleton6 s = Singleton6.getInstance(4);
    }

}
