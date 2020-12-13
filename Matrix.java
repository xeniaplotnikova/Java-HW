package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое количество строк матрицы: ");
        int a = scanner.nextInt();
        System.out.print("Введите желаемое количество столбцов матрицы: ");
        int b = scanner.nextInt();
        double array[][] = new double[a][b];
        int c = 0;
        while (c < a){
            int d = 0;
            while (d < b) {
            System.out.println("Введите " + c + "/" + d + " число в матрицу");
            array[c][d] = scanner.nextDouble();
            d++;
        }
            c++;
    }
        for (c = 0; c < b; c++) {
            System.out.println(array[0][c] * 3);
        }
    }
}
