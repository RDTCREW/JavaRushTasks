package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {


        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));

        String line1 = null;
        String line2 = null;

        while (bufferedReader1.ready()){

            line1 = bufferedReader1.readLine();

            if(line2 != null ) {
                if(line1.equals(line2)) {
                    lines.add(new LineItem(Type.SAME,line1));
                    line2 = null;
                    continue;
                } else {
                    lines.add(new LineItem(Type.ADDED,line2));
                    //line2 = null;
                }
            }

            line2 = bufferedReader2.readLine();
            if (line1.equals(line2)) {
                lines.add(new LineItem(Type.SAME,line1));
                line2 = null;
            } else {
                lines.add(new LineItem(Type.REMOVED,line1));
            }

        }

        if(line2 != null ) {
            //System.out.println("" + Type.ADDED + " " + line2);
            lines.add(new LineItem(Type.ADDED,line2));
        }

        bufferedReader1.close();
        bufferedReader2.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
