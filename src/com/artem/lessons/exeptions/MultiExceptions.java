package com.artem.lessons.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiExceptions {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("num1: ");
            int num1 = sc.nextInt();

            System.out.println("num2: ");
            int num2 = sc.nextInt();

            int dividedNum = num1 / num2;

            System.out.println("After division result: " + dividedNum);

        } catch (InputMismatchException e1) {
            System.out.println("Error! - Please enter a number.");
        } catch (ArithmeticException e2) {
            System.out.println("Error! - You cannot divide any number with 0");
        } catch (Exception e3) {
            System.out.println("An error occurred please try again!");
        }
    }
}