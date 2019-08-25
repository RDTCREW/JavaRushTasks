package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        try {
            //String command = args[0];
            //System.out.println(command);
            //switch (command) {
            switch (args[0]) {

                case "-c":
                    synchronized (allPeople) {
                        for (int i = 3; i < args.length; i += 3) {
                            comandCreate(args[i - 2], args[i - 1], args[i]);
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 4; i < args.length; i += 4) {
                            comandUpdate(args[i - 3], args[i - 2], args[i - 1], args[i]);
                        }
                    }
                    break;
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            comandDelete(args[i]);
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            comandInfo(args[i]);
                        }
                    }
                    break;
                /*default:
                    synchronized (allPeople) {
                        System.out.println("Unknown key. Try: '-с' '-u', '-d', '-i'");
                    }
                    break;
                */
            }
       } catch (Exception e){
            return;

        }
    }

    public static void comandCreate(String name,String sexS,String bdS){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date birthDate = null;
        try {
            birthDate = sdf.parse(bdS);
        }catch (Exception e){
            return;
        }
        Person person = null;

        if ("м".equals(sexS)) {
            person = Person.createMale(name, birthDate);
        } else if ("ж".equals(sexS)) {
            person = Person.createFemale(name, birthDate);
        } else {
            throw new RuntimeException();
        };

        int id = allPeople.size();
        allPeople.add(person);
        System.out.println(id);

    }

    public static void comandUpdate(String idS,String name,String sexS,String bdS){

        int id = Integer.parseInt(idS);

        Sex sex = null;
        if ("м".equals(sexS)) {
            sex = Sex.MALE;
        } else if ("ж".equals(sexS)) {
            sex = Sex.FEMALE;
        } else {
            //throw new RuntimeException();
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date birthDate = null;
        try {
            birthDate = sdf.parse(bdS);
        }catch (Exception e){
            return;
        }

        Person person = null;
        try {
            person = allPeople.get(id);
        }catch (Exception e){
            return;
        }

        person.setName(name);
        person.setSex(sex);
        person.setBirthDate(birthDate);

    }

    public static void comandDelete(String idS) {
        int id = Integer.parseInt(idS);
        Person person = null;
        try {
            person = allPeople.get(id);
        } catch (Exception e){
            return;
        }
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    public static void comandInfo(String idS) {
        int id = Integer.parseInt(idS);

        Person person = null;
        try {
            person = allPeople.get(id);
        } catch (Exception e){
            return;
        }

        Sex sex = person.getSex();
        String sexS = null;
        if (sex == Sex.MALE) {
            sexS = "м";
        } else if (sex == Sex.FEMALE) {
            sexS = "ж";
        } else {
            //sexS = null;
            //throw new RuntimeException();
            return;
        }

        Date birthDate = person.getBirthDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String bdS = null;
        try {
            bdS = sdf.format(birthDate);
        } catch (Exception e){
            return;
        }

        //name sex (м/ж) bd (формат 15-Apr-1990)
        System.out.println(person.getName() + " " + sexS + " " + bdS);

    }
}
