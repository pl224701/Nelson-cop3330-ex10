/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String str2 = sc.nextLine();
        System.out.print("Enter the price of item 2: ");
        String str3 = sc.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String str4 = sc.nextLine();
        System.out.print("Enter the price of item 3: ");
        String str5 = sc.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String str6 = sc.nextLine();
        double n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        double n3 = Integer.parseInt(str3);
        int n4 = Integer.parseInt(str4);
        double n5 = Integer.parseInt(str5);
        int n6 = Integer.parseInt(str6);
        double tax_rate = 0.055;
        double subtotal = n1*n2+n3*n4+n5*n6;
        double tax = tax_rate*subtotal;
        double total = tax+subtotal;
        System.out.printf("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f",subtotal,tax,total);
    }
}
