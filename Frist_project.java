/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frist_project;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Frist_project {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
int num;
        System.out.println("enter your number");
        num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
        
    }
    
    
}
