package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{

            String fileName = reader.readLine();
            reader.close();

            FileInputStream fstream = new FileInputStream(fileName);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fstream));


            ArrayList<Integer> list = new ArrayList<Integer>();


            String strLine;
            int num;

            while ((strLine = bufferedReader.readLine()) != null){
                num = Integer.parseInt(strLine);
                if (num % 2 == 0) {
                    list.add(num);
                }
            }
            bufferedReader.close();
            fstream.close();

            Collections.sort(list);

            for (Integer i: list) {
                System.out.println(i);
            }


        }catch (IOException e){
            //System.out.println("Ошибка");
        }


    }
}
