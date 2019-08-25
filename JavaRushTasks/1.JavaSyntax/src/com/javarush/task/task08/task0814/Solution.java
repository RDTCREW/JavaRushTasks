package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        /*
        for (int i=0; i<20; i++){
            set.add(i);
        }
        1. В первой части цифры вводите вручную,  и не повторяющиеся, через цикл не примет (хотя цикл и не нарушает условия).
        */

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        /*
        2. Удаляйте через итератор.
        */

        /*
        Забегая немножечко вперед нашел элегантное решение!
        set.removeIf (digit -> digit>10);
        */

        /*
        Iterator<Integer> iterator = set.iterator();
        Integer i;
        while (iterator.hasNext()) {
            i = (Integer)iterator.next();
            if (i > 10)
                set.remove(i);
        }
        */

        set.removeIf(digit -> digit>10);

        return set;
    }

    public static void main(String[] args) {

        /*
        HashSet<Integer>  set = createSet();
        removeAllNumbersGreaterThan10(set);
        */

    }
}
