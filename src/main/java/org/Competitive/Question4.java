package org.Competitive;

import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print linearly : ");
        int number = sc.nextInt();
        display(number);
        System.out.println("=============================");
        alternative(number);
    }

    protected static void display(int number)
    {
        if(number!=0)
        {
            System.out.println(number);
            number--;
            display(number);
        }
    }

    protected static void alternative(int number)
    {
        if(number>0)
        {
            System.out.println(number);
            alternative(number-1);
        }
        return;
    }
}
