package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        //String fileName = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1921\\test.txt";

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));


        String data[];
        String name;
        int day;
        int month;
        int year;
        Date birthDate;

        while (fileBufferedReader.ready()) {
            data = fileBufferedReader.readLine().split(" ");
            //System.out.println(data.length);

            name = data[0];
            //System.out.println("name=" + name);

            int iMax = data.length-3;
            for (int i=1; i < iMax; i++ ){
                name = name + " " + data[i];
            }

            day = Integer.parseInt(data[iMax]);
            month = Integer.parseInt(data[iMax+1]);
            year = Integer.parseInt(data[iMax+2]);
            //System.out.println("year=" + year + ", month=" + month + ", day=" + day);
            birthDate = (new GregorianCalendar(year,month-1,day)).getTime();
            //System.out.println("birthDate=" + birthDate);

            PEOPLE.add(new Person(name,birthDate));
        }

        fileBufferedReader.close();

    }
}
