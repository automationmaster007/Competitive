package org.Competitive;

import java.util.concurrent.Callable;

public class Question5
{
    public static void main(String[] args)
    {
        int init=0;
        f(5);
    }

    protected static void f(int n)
    {
        System.out.println(n+"==");
        if(n==0)
        {
            return;
        }
        f(n-1);
        System.out.println(n);
    }
}
