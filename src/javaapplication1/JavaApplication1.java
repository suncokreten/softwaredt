/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author marijaa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int c = 1; c <= 10; c++) {
            System.out.println(c);
        }
        int x, y, z;
        System.out.println("Enter two integers for calculating ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y + x - 2*y;
        System.out.println("Sum of entered integers = "+z);
        String x1, x2;
   
        System.out.println("Enter first large number");
        x1 = in.nextLine();

        System.out.println("Enter second large number");
        System.out.println("*************************");
        x2 = in.nextLine();
   }
                 
             }

