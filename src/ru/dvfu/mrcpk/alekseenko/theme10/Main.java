package ru.dvfu.mrcpk.alekseenko.theme10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание объекта прямоугольник
        Rectangle rectangle1 = new Rectangle(30,45);


        rectangle1.draw();


        System.out.println("\nНазначаем произвольные параметры:");
        // Назначаем параметры

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер сторон прямоугльника, a и b");
        rectangle1.setAB(in.nextFloat(), in.nextFloat());
        System.out.println("Введите координаты точки опоры (x, y) :");
        rectangle1.setXY(in.nextFloat(),in.nextFloat());

        rectangle1.draw();

        // Создание объекта треугольник
        Triangle triangle1 = new Triangle(30, 20, 30);


        triangle1.draw();


        System.out.println("\nНазначаем произвольные параметры:");
        // Назначаем параметры


        System.out.println("Введите размер сторон треугльника, a  b  с");
        triangle1.setAB(in.nextFloat(), in.nextFloat(), in.nextFloat());


        triangle1.draw();


    }
}
