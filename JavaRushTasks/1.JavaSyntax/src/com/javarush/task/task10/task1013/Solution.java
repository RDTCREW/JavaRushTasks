package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private byte ege;
        private boolean sex;
        private Date born;
        private String color;
        private Human child;

        public Human (){

        }

        public Human (String name){
            this.name = name;
        }

        public Human (String name, Date born){
            this.name = name;
            this.born = born;
        }

        public Human (String name, Date born, boolean sex){
            this.name = name;
            this.born = born;
            this.sex = sex;
        }

        public Human (String name, Date born, boolean sex, byte ege){
            this.name = name;
            this.born = born;
            this.sex = sex;
            this.ege = ege;
        }

        public Human (String name, Date born, boolean sex, byte ege, String color){
            this.name = name;
            this.born = born;
            this.sex = sex;
            this.ege = ege;
            this.color = color;
        }

        public Human (String name, Date born, boolean sex, byte ege, String color, Human child){
            this.name = name;
            this.born = born;
            this.sex = sex;
            this.ege = ege;
            this.color = color;
            this.child = child;
        }

        public Human (String name, Human child){
            this.name = name;
            this.child = child;
        }

        public Human (String name, String color){
            this.name = name;
            this.color = color;
        }

        public Human (boolean sex, byte ege, String color){
            this.sex = sex;
            this.ege = ege;
            this.color = color;
        }

    }
}
