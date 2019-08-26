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
        List<String> fileList1 = new ArrayList<>();
        while (bufferedReader1.ready()){
            fileList1.add(bufferedReader1.readLine());
        }
        bufferedReader1.close();


        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        List<String> fileList2 = new ArrayList<>();
        while (bufferedReader2.ready()){
            fileList2.add(bufferedReader2.readLine());
        }
        bufferedReader2.close();


        compareAndAddStrings(fileList1, 0, fileList2, 0);

        compareLists(fileList1, fileList2);



    }

    private static void compareAndAddStrings(List<String> fileList1, int pos1, List<String> fileList2, int pos2){
        String s1, s2;
        if (fileList1.size() != pos1){
            s1 = fileList1.get(pos1);
        } else {
            fileList1.add("");
            return;
        }
        if (fileList2.size() != pos2){
            s2 = fileList2.get(pos2);
        } else {
            fileList2.add("");
            return;
        }

        if (s1.equals(s2) || s1.equals("") || s2.equals("")){
            compareAndAddStrings(fileList1, pos1 + 1, fileList2, pos2 + 1);
        } else if (s1.equals(fileList2.get(pos2 + 1))){
            fileList1.add(pos1, "");
            compareAndAddStrings(fileList1, pos1 + 2, fileList2, pos2 + 2);
        } else if (s2.equals(fileList1.get(pos1 + 1))){
            fileList2.add(pos2, "");
            compareAndAddStrings(fileList1, pos1 + 2, fileList2, pos2 + 2);
        }
    }

    private static void compareLists(List<String> fileList1, List<String> fileList2){
        for (int i = 0; i < fileList1.size(); i++) {
            String s1 = fileList1.get(i);
            String s2 = fileList2.get(i);

            if (s2.equals("")){
                lines.add(new LineItem(Type.REMOVED, s1));
            } else if (s1.equals("")){
                lines.add(new LineItem(Type.ADDED, s2));
            } else lines.add(new LineItem(Type.SAME, s1));
        }
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
