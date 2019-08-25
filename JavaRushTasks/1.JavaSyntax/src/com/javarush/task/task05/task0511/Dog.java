package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {

    String name;
    int height;
    String color;

    public void initialize(String name){
        //5. У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
        this.name = name;
    }

    public void initialize(String name, int height){
        //6. У класса должен быть метод initialize, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        //7. У класса должен быть метод initialize, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {


    }
}
