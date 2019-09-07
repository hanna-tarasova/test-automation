package net.ukr.tasks;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args)  {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number and press button Enter");
            int num1=in.nextInt();

            System.out.println("Enter second number and press button Enter");
            int num2=in.nextInt();

            System.out.println("Here is sum of your numbers:");
            System.out.println(num1+num2);

        }
    }