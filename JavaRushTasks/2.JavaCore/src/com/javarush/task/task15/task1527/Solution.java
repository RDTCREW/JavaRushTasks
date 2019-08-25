package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {

    //public static String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

    public static void main(String[] args) {
        String url;


        Scanner scan = new Scanner(System.in);
        url = scan.nextLine();
        scan.close();


        //url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //url = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";

        int index = url.indexOf('?');
        if(index >= 0) {
            String getParams = url.substring(index + 1);
            if(!getParams.isEmpty()) {

                String getParam;
                ArrayList<String> list = new ArrayList<String>();

                index = getParams.indexOf('&');

                while (index >= 0){
                    getParam = getParams.substring(0,index);
                    if(!getParam.isEmpty()) {
                        list.add(getParam);
                    };

                    getParams = getParams.substring(index + 1);
                    index = getParams.indexOf('&');
                };

                if(getParams.isEmpty()) {

                } else {
                    list.add(getParams);
                };


                String getParamName;
                int indexPos;

                for (int i = 0; i<list.size(); i++) {
                    getParam = list.get(i);
                    indexPos = getParam.indexOf('=');
                    if (indexPos >= 0) {
                        getParamName = getParam.substring(0, indexPos);
                    } else {
                        getParamName = getParam;
                    };
                    if (i!=0) {
                        System.out.print(" ");
                    };
                    System.out.print(getParamName);

                }


                System.out.println();


                String getParamValue;
                double getParamDouble;

                for (int i = 0; i<list.size(); i++) {
                    getParam = list.get(i);
                    indexPos = getParam.indexOf('=');
                    if (indexPos >= 0) {
                        getParamName = getParam.substring(0, indexPos);
                        getParamValue = getParam.substring(indexPos + 1);
                    } else {
                        getParamName = getParam;
                        getParamValue = "";
                    }

                    if (getParamName.indexOf("obj") >= 0) {
                        try {
                            getParamDouble = Double.parseDouble(getParamValue);
                            alert(getParamDouble);
                        }catch (Exception e){
                            alert(getParamValue);
                        }
                    };
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
