package com.nineday.cards;

import java.util.*;

/**
 * Created by nineday on 2018/4/22.
 */
public class Poker {

    public List<Card> cards = new ArrayList<>();

    /*
    生成一副扑克牌
     */
    private void initCards(){

       cards.add(new Card(SuitsEnum.RED_QUEEN,0));
       cards.add(new Card(SuitsEnum.BLACK_QUEEN,0));
       for (int i = 1; i < 14 ; i++){
           cards.add(new Card(SuitsEnum.SPADE,i));
           cards.add(new Card(SuitsEnum.HEART,i));
           cards.add(new Card(SuitsEnum.CLUB,i));
           cards.add(new Card(SuitsEnum.DIAMOND,i));
       }
    }

    /*
    系统向三位玩家发牌
     */
    public void deal(Player p1, Player p2, Player p3) {
        int pop_index;
        Random random = new Random();
        for (int i = 54; i > 3; i--) {
            pop_index = random.nextInt(i);
            if(i%3 == 0){
                p1.list.add(cards.get(pop_index));
            }else if (i%3 == 1){
                p2.list.add(cards.get(pop_index));
            }else {
                p3.list.add(cards.get(pop_index));
            }
            cards.remove(pop_index);
        }
    }

    public static void main(String[] args) {

        Poker poker = new Poker();
        poker.initCards();
        Player player1 = new Player("p1",false, new ArrayList<Card>());
        Player player2 = new Player("p1",false, new ArrayList<Card>());
        Player player3 = new Player("p1",false, new ArrayList<Card>());

        poker.deal(player1,player2,player3);
        sortCards(poker.cards);
        sortCards(player1.list);
        sortCards(player2.list);
        sortCards(player3.list);
        System.out.println("地主牌：");
        print(poker.cards);
        System.out.println("player1 手牌：");
        print(player1.list);
        System.out.println("player2 手牌：");
        print(player2.list);
        System.out.println("player3 手牌：");
        print(player3.list);

    }

    public static void print(List<Card> list){
        for(int i = 0 ; i< list.size() ; i++){
            System.out.print(list.get(i).value + " ");
        }
        System.out.println("");

    }
    public  static  void sortCards(List<Card> list){
        Card cardA, cardB ;
        int size = list.size();
        for(int i = 0; i< size ; i++){
            for (int j = size-1 ; j > 0; j--){
                if(list.get(j).weight > list.get(j-1).weight ){
                    cardA = list.get(j);
                    cardB = list.get(j-1);
                    list.set(j-1,cardA);
                    list.set(j,cardB);
                }
            }
        }

    }


}
