package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                list.add(scan.nextInt());
            } catch (Exception e) {
                break;
            }
        }


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
