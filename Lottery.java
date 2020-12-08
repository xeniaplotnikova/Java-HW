package com.company;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int x = 9;
        int y = 7;
        int z = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int b = 0;
        while (b < a) {
            System.out.println("Задайте " + (b + 1) + " член массива: ");
            array[b] = scanner.nextInt();
            b++;
        }
        for (int c: array) {
            if (c == x || c == y || c == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
