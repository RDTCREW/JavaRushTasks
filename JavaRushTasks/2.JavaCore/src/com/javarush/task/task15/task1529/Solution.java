package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if ("helicopter".equals(str)){
            result = new Helicopter();
        } else if ("plane".equals(str)) {

            int quantity = Integer.parseInt(scan.nextLine());
            result = new Plane(quantity);
        }

        scan.close();

    }
}
