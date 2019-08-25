package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        /*rrayList<String>[] allList = new ArrayList<String>[3];

        allList[0] = new ArrayList<String>();
        allList[0].add("ххх11");
        allList[0].add("ххх12");
        allList[0].add("ххх13");

        allList[1] = new ArrayList<String>();
        allList[1].add("ххх21");
        allList[1].add("ххх22");
        allList[1].add("ххх23");

        allList[2] = new ArrayList<String>();
        allList[2].add("ххх31");
        allList[2].add("ххх32");
        allList[2].add("ххх33");
        */

        ArrayList<String>[] allList = new ArrayList[3];
        for(int i = 0; i < allList.length; i++) {
            allList[i] = new ArrayList<String>();
            allList[i].add("ххх" + i);
        }
        return allList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}