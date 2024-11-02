package org.Competitive;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        int count = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        callName(count,name);
    }

    protected static void callName(int count, String name)
    {
        if(count!=0)
        {
            System.out.println(name);
            --count;
            callName(count,name + " " + count);     // I added count in the end to check the final output with number. For verification.
        }
        else
            return;
    }
}
