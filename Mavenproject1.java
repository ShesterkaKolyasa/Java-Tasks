/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input initial three-digit number: ");
        int initialNumber = scan.nextInt();
        System.out.println("Input finite three-digit number: ");
        int finiteNumber = scan.nextInt();
        int oddCounter = 0;
        int evenCounter = 0;
        if ((initialNumber / 100 == 0) | (finiteNumber / 100 == 0)){
            System.out.println("Entered wrong number ");
            System.exit(1);
        }
        else{
            for (int i = initialNumber; i <= finiteNumber; i++){
                if (i % 2 == 0) {
                    evenCounter = evenCounter + 1;
                }
                else {
                    oddCounter = oddCounter + 1;
                }
            }
            System.out.println("Quantity if odd number: " + evenCounter);
            System.out.println("Quantity if even number: " + oddCounter);
        }
    }
}