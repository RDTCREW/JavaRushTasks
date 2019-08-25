package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {

    //1. У класса Rectangle должны быть переменные top, left, width и height с типом int.
    int top, left, width, height;

    public Rectangle(int left, int top, int width, int height){
        //- заданы 4 параметра: left, top, width, height
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top){
        //- ширина/высота не задана (оба равны 0)
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int left, int top, int width){
        //- высота не задана (равно ширине) создаём квадрат
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle rect){
        //- создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.left = rect.left;
        this.top = rect.top;
        this.width = rect.width;
        this.height = rect.width;
    }


    public static void main(String[] args) {

    }
}
