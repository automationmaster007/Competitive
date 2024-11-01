package org.Competitive;

import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        fun(number);
    }

    public static void fun(int number)
    {
        if(number<1)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(number);
            fun(number-1);
        }
    }
}
