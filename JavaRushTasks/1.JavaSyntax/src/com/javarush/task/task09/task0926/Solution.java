package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list  = new ArrayList<>();
        list.add(new int[]{7, 12, 8, 4, 33});
        list.add(new int[]{7, 12});
        list.add(new int[]{7, 12, 8, 4});
        list.add(new int[]{7, 12, 8, 4, 33, 6, 7});
        list.add(new int[]{});

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
