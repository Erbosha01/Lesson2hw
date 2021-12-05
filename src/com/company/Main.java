package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(walk(12, 30));
        System.out.println(walk(90, 0));
        System.out.println(walk(30, 40));
        System.out.println(walk(10, 5));
        System.out.println(walk(40, 25));
        System.out.println(walk(generateRandomAge(), 10));
    }
    public static String walk(int age, int temperature) {

        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return age + " " + temperature;
    }

    // Доп дз
    public static int generateRandomAge() {
        Random r = new Random();
        int x = r.nextInt(100);
        return x;
    }
}
