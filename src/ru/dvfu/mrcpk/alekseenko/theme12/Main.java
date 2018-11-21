package ru.dvfu.mrcpk.alekseenko.theme12;
import java.util.Scanner;

public class Main {

    static Person[] persons;


//jkjkjmn,mnm

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       persons = new Person[100];


            Person vasya = new Person("Вася", "Пупкин", "Иванович");

            persons[0] = vasya;

             System.out.println("Введите имя, фамилию, очество");
             String firstname = in.next();
             String lastname = in.next();
             String middlename = in.next();

             Person petya = new Person ("Петя", "Иванов", "Иванович");







        }

    }