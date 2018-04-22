package com.nineday.cards;

import java.util.List;

/**
 * Created by nineday on 2018/4/22.
 */
public class Player {

    //玩家姓名
    public String name ;

    //是否地主
    public  boolean isRicher;

    //手牌
    public List<Card> list;

    public Player(String name, boolean isRicher, List list){
        this.name = name;
        this.isRicher = isRicher;
        this.list = list;
    }


}
