package com.company;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double miles = 0.0006;
        double yards = 1.094;
        double kilos = 0.001;
        double milligrams = 0.000001;
        System.out.println("Выберите, что переводить: 1 - расстояние, 2 - масса");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - мили, 2 - ярды");
            int num = scanner.nextInt();
            System.out.println("Укажите число");
            double number = scanner.nextDouble();
            if (num == 1) {
                System.out.println("Ответ: " + (number * miles));
            } else if (num == 2) {
                System.out.println("Ответ: " + (number * yards));
            } else {
                System.out.println("Введите либо 1, либо 2");
            }
        }
        else if (choice == 2) {
                System.out.println("Выберите единицу измерения: 1- килограммы, 2 - милиграммы");
                int num = scanner.nextInt();
                System.out.println("Укажите число");
                double number = scanner.nextDouble();
                if (num == 1) {
                    System.out.println("Ответ: " + (number * kilos));
                } else if (num == 2) {
                    System.out.println("Ответ: " + (number * milligrams));
                } else {
                    System.out.println("Введите либо 1, либо 2");
                }
            } else {
                System.out.println("Введите либо 1, либо 2");
            }
        }
    }








