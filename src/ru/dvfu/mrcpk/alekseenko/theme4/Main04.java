package ru.dvfu.mrcpk.alekseenko.theme4;

import java.util.Scanner;

// калькулятор
public class Main04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = 0;


        String menu = "1) a+b:\n2) a-b\n3) a*b:";
        System.out.println("Введите значение a" + a);
        System.out.println("Введите значение b" + b);

        int n = in.nextInt();
        int result;


        switch (n) {
            case 1:
                result = a + b;

                break;
        }
    }}
