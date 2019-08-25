package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{

    public int getCountOfEggsPerMonth(){
        return 4;
    }

    public String getDescription(){
        String str = super.getDescription();
        return str + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
