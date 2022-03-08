package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);


    void calc(){
        System.out.println("-*- CALCULATOR -*-");

        System.out.println("1 + Sum" + "\n2 - Minus" + "\n3 * Multiply"
        + "\n4 / Divide" + "\n5 % Mod" + "\n6 ^ Pow" + "\n7**(0.5) Sqrt" + "\n8 ! Go out");
        int pick = scanner.nextInt();
        if (pick >= 1 && pick <= 8){
            switch (pick){
                case 1:
                    System.out.println("nums--->");
                    sum(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 2:
                    System.out.println("nums--->");
                    minus(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 3:
                    System.out.println("nums--->");
                    multiply(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 4:
                    System.out.println("nums--->");
                    divide(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 5:
                    System.out.println("nums--->");
                    mod(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 6:
                    System.out.println("nums--->");
                    pow(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 7:
                    System.out.println("num--->");
                    sqrt(scanner.nextInt());
                    calc();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:

                    System.out.println(scanner.nextDouble() + ", " + scanner.nextDouble());
            }
        }else{
            System.out.println("Wrong number!");
            calc();
        }

    }

    void sum(double num1, double num2){

        System.out.println("num1: " + num1 + "\nnum2: " + num2);
        System.out.println("Result: " + num1 + num2); ;
    }

    void minus(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 - num2));
    }

    void divide(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 / num2));
    }

    void mod(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 % num2));
    }

    void multiply(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 * num2));
    }

    void pow(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        double pow = Math.pow(num1, num2);
        System.out.println("Result: " + pow);
    }

    void sqrt(double num1){
        System.out.println("the num: " + num1);
        double sqrt = Math.sqrt(num1);
        System.out.println("Result: " + sqrt);
    }


}
