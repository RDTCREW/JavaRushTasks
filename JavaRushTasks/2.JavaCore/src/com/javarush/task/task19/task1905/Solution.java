package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        /*
        countries.put("Ukraine","UA");
        countries.put("Russia","RU");
        countries.put("Canada","CA");
        */
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA","Canada");

    }

    public static void main(String[] args) {

        /*
        String name = "Ivanov, Ivan";               //For example: Ivanov, Ivan
        String names[] = name.split(", ");
        System.out.println(names[0]);
        System.out.println(names[1]);
        */

    }

    public static class DataAdapter implements RowItem{

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        //RowItem(
        @Override
        public String getCountryCode() {
            //RowItem
            //String getCountryCode();        //For example: UA

            String countryName = this.customer.getCountryName();//For example: Ukraine

            /*
            String countryCode = countries.get(countryName);
            */
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if ( countryName.equals(   entry.getValue()  ) ){
                    return entry.getKey();
                }
            }

            return null;
        }

        @Override
        public String getCompany() {
            //RowItem
            //String getCompany();            //For example: JavaRush Ltd.

            String companyName = this.customer.getCompanyName();        //For example: JavaRush Ltd.
            return companyName;
        }

        @Override
        public String getContactFirstName() {
            //RowItem
            //String getContactFirstName();   //For example: Ivan

            String name = this.contact.getName();               //For example: Ivanov, Ivan
            String names[] = name.split(", ");
            return names[1];
        }

        @Override
        public String getContactLastName() {
            //RowItem
            //String getContactLastName();    //For example: Ivanov

            String name = this.contact.getName();               //For example: Ivanov, Ivan
            String names[] = name.split(", ");
            return names[0];
        }

        @Override
        public String getDialString() {
            //RowItem
            //String getDialString();         //For example: callto://+380501234567

            String phoneNumber = this.contact.getPhoneNumber();   //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
            String phoneNumbers[] = phoneNumber.split(" or ");

            phoneNumber = phoneNumbers[0];
            phoneNumber = phoneNumber.replaceAll("\\(|\\)|\\-", ""); //регулярным выражением заменяем буквы(\\w) и цифры(\\d) на пустую строку, то есть удаляем.
            //System.out.println(phoneNumber);

            return "callto://" + phoneNumber;
        }
        //RowItem)
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}