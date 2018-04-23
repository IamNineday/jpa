/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StyleEnum
 * Author:   nineday
 * Date:     2018/4/23 17:04
 * Description: 牌型分类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nineday.cards;/**
 * Created by nineday on 2018/4/23.
 */

/**
 *   玩家每次打出的牌，有以下几种类型
 *   炸弹 、飞机、连对、四带两对、四带二、三带二、三带一、顺子、三张、一对、单张
 *
 * 〈牌型分类〉
 *
 * @author nineday
 * @create 2018/4/23
 * @since 1.0.0
 */
public enum StyleEnum {

    BOOM,
    PLANE,
    PAIRS,
    FOUR_TWOPAIRS,
    FOUR_TWO,
    THREE_TWO,
    THREE_ONE,
    STRAIGHT,
    THREE,
    PAIR,
    SINGLE,
    NONE;


}
