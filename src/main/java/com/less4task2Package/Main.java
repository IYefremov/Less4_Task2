package com.less4task2Package;

public class Main {
    public static void main(String[] args) {

        Boxer boxer1 = new Boxer(44, 80, 100);
        Boxer boxer2 = new Boxer(40, 81, 101);

        boolean result = boxer1.fight(boxer2);

         if (result) {
             System.out.println("The boxer 1 is win");
         }else{
             System.out.println("The boxer 2 is win");
         }
    }
}
