package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 3;
    }

    public String getDescription(){
        String str = super.getDescription();
        return str + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
