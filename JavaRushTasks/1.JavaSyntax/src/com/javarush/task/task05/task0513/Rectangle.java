package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int width){
        this.width = width;
        this.height = width;
        this.top = 0;
        this.left = 0;
    }

    public void initialize(int width, int height){
        this.width = width;
        this.height = height;
        this.top = 0;
        this.left = 0;
    }

    public void initialize(int width, int height, int top){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = 0;
    }

    public void initialize(int width, int height, int top, int left){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }



    public static void main(String[] args) {

    }
}
