package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 10; i > 0; i--){

            for (int j = 11 - i; j > 0; j--){
                System.out.print("8");
            }
            System.out.println();
        }


    }
}