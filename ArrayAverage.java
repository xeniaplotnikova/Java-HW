package com.company;

import java.util.Scanner;

public class ArrayAverage {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = scanner.nextInt();
        double[] array = new double[a];
        int b = 0;
        double avg = 0;
        while(b < a){
            System.out.println("Задайте " + (b + 1) + " число массива: ");
            array[b] = scanner.nextDouble();
            avg += array[b];
            b++;
        }
        avg /= a;
        System.out.println("Среднее арифметическое: " + avg);
        System.out.println("Выводим массив на экран, умножив каждый член массива на среднее арифметическое: ");
        for (double c : array) {
            System.out.println(c * avg);
        }
    }

}



