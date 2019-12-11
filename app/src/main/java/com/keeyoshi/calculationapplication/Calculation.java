package com.keeyoshi.calculationapplication;

public class Calculation {
    private double radius;
    private int num1, num2;
    private int palNumber;
    private double num3=3.14;

    public Calculation(float R) {
        radius = R;
    }

    public Calculation(int palNumber)
    {
        this.palNumber=palNumber;
    }

    public Calculation(int FirstNumber, int SecondNumber)

    {
        num1=FirstNumber;
        num2=SecondNumber;
    }
    public int[] SwapNumber()
    {
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        return new int[]{num1,num2};
    }

    public double AreaOfCircle(){
        return num3*radius*radius;
    }
    public  boolean CheckPalindrome()
    {

        int temp=palNumber;
        int rev=0,rem;
        while(temp!=0)
        {
            rem= temp%10;
            rev =rev*10+rem;
            temp= temp/10;
        }
        if( rev==palNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  int  ReverseNumber()
    {
        int temp=palNumber;
        int rev=0,rem;
        while(temp!=0)
        {
            rem= temp%10;
            rev =rev*10+rem;
            temp= temp/10;
        }
        return rev;
    }
}

