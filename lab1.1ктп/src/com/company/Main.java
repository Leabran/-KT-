package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n;
        boolean rezult;
        for(n = 2; n < 100; n++)
        {
            rezult=isPrime(n);
            if (rezult==true)
                System.out.printf("%d\t", n);
        }
    }
    public static boolean isPrime(int n)
    {
        boolean a =true;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
                a = false;
        }
        return a;
    }
}