package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter a number to find its form as the sum of two integers: ");
        int number = scanNumber.nextInt();

        for (int i = 0; i <= number; i++) {
            if (primeCheck(i)) {
                if (primeCheck(number - i)) {
                    System.out.println(number + " = " + i + " + " + (number - i));
                    if((number-i)==number/2){
                        break;
                    }
                }
            }
        }

    }

    public static boolean primeCheck(int number) {
        boolean isPrime = false;
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            isPrime = true;
        }
        return isPrime;
    }
}
