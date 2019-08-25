package com.javarush.task.task17.task1710;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {


        try {
            String command = args[0];
            //System.out.println(command);

            if ("-c".equals(command) || "-с".equals(command)) {
                comandCreate(args[1],args[2],args[3]);
            } else if ("-u".equals(command)) {
                comandUpdate(args[1],args[2],args[3],args[4]);
            } else if ("-d".equals(command)) {
                comandDelete(args[1]);
            } else if ("-i".equals(command)) {
                comandInfo(args[1]);
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