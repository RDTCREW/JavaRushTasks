package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
       if ( this.strength > anotherCat.strength)
           return true;
       else if ( this.strength < anotherCat.strength)
           return false;

       if ( this.weight + this.age > anotherCat.weight + anotherCat.age)
            return true;
       else if ( this.weight + this.age < anotherCat.weight + anotherCat.age)
           return false;

        return false;


    }

    public static void main(String[] args) {

    }
}
