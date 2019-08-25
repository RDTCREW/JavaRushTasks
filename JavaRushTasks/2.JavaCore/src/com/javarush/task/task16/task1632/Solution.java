package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {

        threads.add(new thread1());
        threads.add(new thread2());
        threads.add(new thread3());
        threads.add(new thread4());
        threads.add(new thread5());

    }

    public static void main(String[] args) {

    }


    public static class thread1 extends Thread{

        public thread1() {
            super("1");
        }

        @Override
        public void run()  {
            while (true){
                /*
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                */
            }
        }
    }

    public static class thread2 extends Thread{

        public thread2() {
            super("2");
        }

        @Override
        public void run()  {

            while (isInterrupted()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }

        }
    }

    public static class thread3 extends Thread{

        public thread3() {
            super("3");
        }

        @Override
        public void run()  {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {

            }
        }
    }

    public static class thread4 extends Thread implements Message{

        public thread4() {
            super("4");
        }

        @Override
        public void run()  {

            try {
                while (true){
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {

            }
        }

        @Override
        public void showWarning() {
            if(this.isAlive()) {
                this.interrupt();
            }
        }

    }

    public static class thread5 extends Thread{

        public thread5() {
            super("5");
        }

        @Override
        public void run()  {

            Scanner scan = new Scanner(System.in);
            int sum = 0;
            String str = scan.nextLine();
            while(!"N".equals(str)) {
                sum += Integer.parseInt(str);
                str = scan.nextLine();
            };
            scan.close();
            System.out.println(sum);
        }
    }
}