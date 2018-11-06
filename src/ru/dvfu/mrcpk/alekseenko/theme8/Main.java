package ru.dvfu.mrcpk.alekseenko.theme8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Задание начальных значений массива");
        for (int i = 0; i < array.length; i++);


        for (int element : array) {
            element = new Random().nextInt(10);

            System.out.print(element + "\t");
        }
        }




    }






