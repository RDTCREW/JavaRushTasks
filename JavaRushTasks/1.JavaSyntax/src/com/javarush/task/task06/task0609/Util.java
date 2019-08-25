package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.*;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double x = (double)abs(x1 - x2);
        double y = (double)abs(y1 - y2);
        double result = sqrt(x*x + y*y);
        return result;
    }

    public static void main(String[] args) {

    }
}
