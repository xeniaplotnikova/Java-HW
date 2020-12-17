package com.company;

import java.util.Scanner;

public class Puzzle11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String firstNum = Double.toString(scanner.nextDouble());
        System.out.println("Введите еще одно число:");
        int secondNum = (int) scanner.nextDouble();
        if ((int) Double.parseDouble(firstNum) > secondNum) {
            System.out.println(firstNum);
            System.out.println((double) secondNum);
        }
        else if ((int) Double.parseDouble(firstNum) < secondNum) {
            System.out.println(secondNum);
            System.out.println(Double.parseDouble(firstNum));
        }
    }
}
