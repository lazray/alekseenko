package ru.dvfu.mrcpk.alekseenko.theme8;
import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int t = in.nextInt();

        int y = myPow(x,t);

        System.out.println("Число х = " + x + ", возведенное в степень равно" + y);
    }

        static int myPow(int x, int t)


    {
        if(t == 0) return 1;
       else if(t == 1) return x;
        x = x * x; ++t;
        return myPow(x,t);
    }


    }

