package com.mnl.yumeapp.my_app_web5;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner input = new Scanner(System.in);
        float input1= input.nextFloat();
        float input2= input.nextFloat();
       
        Addition(input1,input2);
        Division(input1,input2);
        Multiplication(input1,input2);
        Subtraction(input1,input2);
        Exponent(input1,input2);
    }
    public static void Addition(float x, float y){
    	System.out.println("Sum is "+ (x+y));
    }
    public static void Division(float x, float y){
    	System.out.println("Quotient is "+ (x/y));
    }
    public static void Multiplication(float x, float y){
    	System.out.println("Product is "+ (x*y));
    }
    public static void Subtraction(float x, float y){
    	System.out.println("Difference is "+ (Math.subtractExact((int)x, (int)y)));
    }
    public static void Exponent(float x, float y){
    	System.out.println("Result is "+ (Math.pow(x, y)));
    	
    	
    }
 
   
}
