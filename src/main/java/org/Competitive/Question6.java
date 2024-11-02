package org.Competitive;

import java.util.Scanner;

public class Question6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Submission of n numbers. Enter a number : ");
        int number = sc.nextInt();
        System.out.println(function(number));
    }

    protected static int function(int number)
    {
        if(number==1)
        {
            return 1;
        }
        return (number + function(number-1));
    }
}
