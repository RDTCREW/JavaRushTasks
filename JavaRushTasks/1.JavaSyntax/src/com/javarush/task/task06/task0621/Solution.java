package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);


        дедушка Вася
        бабушка Мурка
        папа Котофей
        мама Василиса
        сын Мурчик
        дочь Пушинка
        */

        String gtandFatherName = reader.readLine();
        Cat catGtandFather = new Cat(gtandFatherName);

        String gtandMatherName = reader.readLine();
        Cat catGtandMather = new Cat(gtandMatherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGtandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGtandMather, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGtandFather);
        System.out.println(catGtandMather);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        //private Cat parent;
        private Cat mother;
        private Cat father;


        Cat(String name) {

            this.name = name;
        }

        /*
        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        */

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String result = "The cat's name is " + name;;

            if (mother == null)
                result += ", no mother ";
            else
                result += ", mother is " + mother.name;

            if (father == null)
                result += ", no father ";
            else
                result += ", father is " + father.name;


            return result;
        }
    }

}
