package ru.dvfu.mrcpk.alekseenko.theme1;
// задача нахождения следующего четного числа
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение целое натуральное число ");

        int x;
// Вводимое значение
        x = in.nextInt();

        //Вычисление четного числа
        int y = ((x / 2) * 2 + 2);

        // Приглашение ввести данных
        System.out.println("Четное число " + y);
    }
}
