package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasia",30,"Odessa");
        Man man2 = new Man("Igor",35,"Odessa");

        Woman woman1 = new Woman("Tania",20,"Odessa");
        Woman woman2 = new Woman("Anna",18,"Odessa");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man {
        //У классов должны быть поля: name (String), age (int), address (String).
        String name;
        int age;
        String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

    }

    public static class Woman {
        //У классов должны быть поля: name (String), age (int), address (String).
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

    }
}
