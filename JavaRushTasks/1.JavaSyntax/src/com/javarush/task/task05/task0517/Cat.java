package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        //6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = 3;
        this.weight = 3;
        //this.address;
        this.color = "grey";
    }

    public Cat(String name, int weight, int age){
        //7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address;
        this.color = "grey";
    }

    public Cat(String name, int age){
        //8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = 3;
        //this.address;
        this.color = "grey";
    }

    public Cat(int weight, String color){
        //9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
        //this.name = name;
        this.age = 3;
        this.weight = weight;
        //this.address;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        //10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
        //this.name = name;
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }






    public static void main(String[] args) {

    }
}
