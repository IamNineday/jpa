package com.nineday.cards;

/**
 * Created by nineday on 2018/4/22.
 *
 * 每个扑克牌对应一个对象
 *
 */
public class Card {

    public int suits ;

    public int number;

    public int  weight ;

    public boolean isRedQueen = false;

    public  boolean isBlackQueen = false;

    public String value ;

    public Card(SuitsEnum e, int v){

        switch (e){
            case  SPADE : suits = 1; break;
            case HEART:   suits = 2; break;
            case CLUB:    suits = 3; break;
            case DIAMOND: suits = 4; break;
            case RED_QUEEN: isRedQueen = true; weight = 100 ; value = "RED"; break;
            case BLACK_QUEEN: isBlackQueen = true; weight = 99 ;  value = "BLACK"; break;
        }
        switch (v){
            case 1  :  weight = 12 ; value = "A";break;
            case 2  :  weight = 13; value = "2"; break;
            case 3  :  weight = 1; value = "3"; break;
            case 4  :  weight = 2; value = "4"; break;
            case 5  :  weight = 3; value = "5"; break;
            case 6  :  weight = 4; value = "6"; break;
            case 7  :  weight = 5; value = "7"; break;
            case 8  :  weight = 6; value = "8";break;
            case 9  :  weight = 7; value = "9"; break;
            case 10 :  weight = 8; value = "10";break;
            case 11 :  weight = 9; value = "J"; break;
            case 12 :  weight = 10; value = "Q"; break;
            case 13 :  weight = 11; value = "K"; break;
        }


    }





}
