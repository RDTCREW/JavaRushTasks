package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Contact,Customer{

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;


        }

        //Contact(
        @Override
        public String getName() {
            //Contact
            //String getName();               //For example: Ivanov, Ivan

            //IncomeData
            //String getContactFirstName();   //For example: Ivan
            //String getContactLastName();    //For example: Ivanov

            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            //Contact
            //String getPhoneNumber();        //For example: +38(050)123-45-67

            //IncomeData
            //int getCountryPhoneCode();      //For example: 38
            //int getPhoneNumber();           //For example: 501234567


            String phoneNumber;
            //TODO
            //phoneNumber = String.format(Locale.ENGLISH,"",incomeData.getPhoneNumber());

            //phoneNumber = Integer.toString(data.getPhoneNumber());
            //phoneNumber = "0000000000" + phoneNumber;
            //phoneNumber = phoneNumber.substring(phoneNumber.length()-10);

            phoneNumber = String.format("%010d", data.getPhoneNumber());
            //phoneNumber = String.format("+%d(%3s)%3s-%2s-%2s",data.getCountryPhoneCode(), phoneNumber.substring(0, 3), phoneNumber.substring(3, 6), phoneNumber.substring(6, 8), phoneNumber.substring(8, 10));
            phoneNumber = "+" + data.getCountryPhoneCode() + "(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,8) + "-" + phoneNumber.substring(8,10);

            return phoneNumber;
        }
        //Contact)

        //Customer(
        @Override
        public String getCompanyName() {
            //Customer
            //String getCompanyName();        //For example: JavaRush Ltd.

            //IncomeData
            //String getCompany();            //For example: JavaRush Ltd.

            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            //Customer
            //String getCountryName();        //For example: Ukraine

            //IncomeData
            //String getCountryCode();        //For example: UA

            return countries.get(data.getCountryCode());
        }
        //Customer)

    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}