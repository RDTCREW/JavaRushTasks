package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int n = 0;

        for (int i = 0; i < 10; i++) {
            char[] charI = list.get(i).toCharArray();
            for (char c: charI) {
                if (map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                } else {
                    map.put(c,1);
                }
            }

        }


        for (char c: alphabet) {
            System.out.print(c);
            System.out.print(" ");
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                System.out.println(0);
            }
        }



    }
}
