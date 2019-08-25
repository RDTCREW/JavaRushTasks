package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.javarush.task.task15.task1525.Statics.FILE_NAME;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {

        /*//посимвольное чтение
        try(FileInputStream fin = new FileInputStream(Statics.FILE_NAME))
        {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i=-1;
            while( ( i = fin.read() ) != -1 ){
                System.out.print((char)i);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        */

        /*//посимвольное чтение
        try(FileReader reader = new FileReader(Statics.FILE_NAME))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        */

        //чтение построчное, работает
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(Statics.FILE_NAME), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            // log error
        }

        /*
        List<String> lines = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
        for(String line: lines){
            System.out.println(line);
        }
        */

        /*
        Files.lines(Paths.get(FILE_NAME), StandardCharsets.UTF_8).forEach(System.out::println);
         */


        /*//чтение построчное, работает
        try (Scanner scan = new Scanner(new File(Statics.FILE_NAME))){
            String line;
            while(scan.hasNext()){
                line = scan.nextLine();
                System.out.println(line);
                lines.add(line);
            }
            scan.close();
        } catch (IOException e) {
            // log error
        }
        */
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
