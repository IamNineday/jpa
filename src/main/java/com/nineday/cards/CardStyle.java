/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CardStyle
 * Author:   nineday
 * Date:     2018/4/23 16:20
 * Description: 牌型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nineday.cards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *   玩家每次打出的牌，有以下几种类型
 *   炸弹 、飞机、连对、三带二、三带一、顺子、三张、一对、单张
 *   <br>
 * 〈牌型〉
 *
 * @author nineday
 * @create 2018/4/23
 * @since 1.0.0
 */
public class CardStyle {

    //牌型
    public StyleEnum style;

    //牌型名称
    public String styleName;

    //牌数量
    public int countOfCards;

    //大小
    public int weight;

    //牌
    public List<Card> cards;


    /*
        生成牌型
     */
    public CardStyle(List<Card> cards){

        countOfCards = cards.size();
        if(countOfCards == 0) {
            style = StyleEnum.NONE;
            styleName = "你未选择手牌";
            weight = 0;
            return;
        }
        for (int i = 0; i < countOfCards; i++) {
            this.cards.set(i,cards.get(i));
        }

        if(countOfCards == 1){//单张
            style = StyleEnum.SINGLE;
            styleName = "单张";
            weight = cards.get(0).weight;
            return;
        }else if(countOfCards == 2){//一对
            if(cards.get(0).isRedQueen){ //皇炸
                style = StyleEnum.BOOM;
                styleName = "一对";
                weight = cards.get(0).weight;
            }
            style = StyleEnum.PAIR;
            styleName = "一对";
            weight = cards.get(0).weight;
            return;
        }else if(countOfCards == 3){//三张
            style = StyleEnum.THREE;
            styleName = "三张";
            weight = cards.get(0).weight;
            return;
        }else if (countOfCards == 4){ //4张

            if(true){ //炸弹

            }




        }





    }

    /*
    分析手牌的类型和大小
     */
    public static Map<String ,Object> AnlCards(List<Card> list){
        Map<String, Object> map = new HashMap<>() ;
        int size = list.size();
        int tmp_weight1 = 0, tmp_weight2 = 0;
        int count_weight1 = 0, count_weight2 =0;
        if(size == 4){
            tmp_weight1 = list.get(0).weight;
            count_weight1 = 1;
            for (int i = 1; i < size; i++) {
                if(tmp_weight1 == list.get(i).weight){
                    count_weight1++;
                }else{
                    tmp_weight2 = list.get(i).weight;
                    count_weight2 ++;
                }
            }
            if(tmp_weight1 == 0){
                map.put("sytle","");
            }

        }

        return null;
    }



}