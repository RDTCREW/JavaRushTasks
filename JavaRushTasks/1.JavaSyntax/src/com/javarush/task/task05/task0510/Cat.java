package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        //7. У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = 2;
        this.weight = 3;
        //this.address;
        this.color = "black";
    }

    public void initialize(String name, int weight, int age){
        //8. У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = weight;
        //this.address;
        this.color = "black";
    }

    public void initialize(String name, int age){
        //9. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
        this.name = name;
        this.age = age;
        this.weight = 3;
        //this.address;
        this.color = "black";
    }

    public void initialize(int weight, String color){
        //10. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
        //this.name = name;
        this.age = 2;
        this.weight = weight;
        //this.address;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        //11. У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
        //this.name = name;
        this.age = 2;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }


    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.initialize("Vaska");



    }
}
