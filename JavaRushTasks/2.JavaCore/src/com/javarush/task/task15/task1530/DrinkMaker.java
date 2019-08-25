package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {

    public abstract void getRightCup();// выбрать подходящую чашку
    public abstract void putIngredient();//положить ингредиенты
    public abstract void pour();//залить жидкостью


    public void makeDrink(){

        //готовит напиток в последовательности:
        // выбирает чашку, кладет ингредиенты, заливает жидкостью.
        getRightCup();
        putIngredient();
        pour();

    }


}
