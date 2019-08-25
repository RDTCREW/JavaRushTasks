package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//import java.nio.file.Paths;
/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException{
        /*
        String fileNAme = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\test.txt";
        Scanner fileScanner = new Scanner(Paths.get(fileNAme), "Windows-1251");
        PersonScanner personScannerAdapter = new PersonScannerAdapter(fileScanner);

        Person person1 = personScannerAdapter.read();
        System.out.println(person1);

        Person person2 = personScannerAdapter.read();
        System.out.println(person2);

        personScannerAdapter.close();
        */


    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        //PersonScanner(
        @Override
        public Person read() throws IOException {
            /*
            Данные в файле хранятся в следующем виде:
            Иванов Иван Иванович 31 12 1950
            Петров Петр Петрович 31 12 1957

            Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
            */

            if (fileScanner.hasNextLine()){
                try {
                    String line = fileScanner.nextLine();

                    line = line.trim();
                    //System.out.println(line);

                    //arrLine = line.split(" ");
                    String[] arrLine = line.split("\\s*(\\s|,|!|\\.)\\s*");
                    //for (String world:arrLine){
                    //    System.out.println(world);
                    //}

                    //Иванов Иван Иванович 31 12 1950

                    String lastName = arrLine[0];
                    //System.out.println(lastName);

                    String firstName = arrLine[1];
                    //System.out.println(firstName);

                    String middleName = arrLine[2];
                    //System.out.println(middleName);


                    //System.out.println(Integer.parseInt(arrLine[5]));
                    //System.out.println(Integer.parseInt(arrLine[4]));
                    //System.out.println(Integer.parseInt(arrLine[3]));
                    //Date birthDate = new Date(Integer.parseInt(arrLine[5]), Integer.parseInt(arrLine[4]), Integer.parseInt(arrLine[3]));
                    Date birthDate = (new SimpleDateFormat("yyyy-MM-dd")).parse(arrLine[5] + "-" + arrLine[4] + "-" + arrLine[3]);
                    //System.out.println(birthDate);

                    return new Person(firstName, middleName, lastName, birthDate);
                } catch (ParseException e){
                    throw new IOException();
                }

            }


            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
        //PersonScanner)

    }
}
