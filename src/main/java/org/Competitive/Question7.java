package org.Competitive;

import java.util.Scanner;

public class Question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial : ");
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }

    protected static int factorial(int number)
    {
        if(number==1)
        {
            return 1;
        }
        return (number * factorial(number-1));
    }
}
