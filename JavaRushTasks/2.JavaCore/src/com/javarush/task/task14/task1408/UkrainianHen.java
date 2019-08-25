package com.javarush.task.task14.task1408;


public class UkrainianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 2;
    }

    public String getDescription(){
        String str = super.getDescription();
        return str + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}