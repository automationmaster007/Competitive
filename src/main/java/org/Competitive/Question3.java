package org.Competitive;

import java.util.Scanner;

public class Question3
{

    //  Question 3 : Print linearly from 1 to N.
    public static void main(String[] args)
    {
        int limit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print linearly.");
        int number = sc.nextInt();
        display(limit,number);
    }

    protected static void display(int limit, int number)
    {
        if(limit!=number)
        {
            System.out.println(number);
            ++limit;
            display(limit,number);
        }
        return;
    }

    protected static void alternative(int number)
    {
        if(number==0)
        {
            return;
        }
        alternative(number-1);
        System.out.println(number);
    }
}
