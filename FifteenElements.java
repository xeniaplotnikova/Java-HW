package com.company;

import java.util.Random;

public class FifteenElements {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int i = 0;
        int min = 21;
        int max = -21;
        while (i < array.length) {
            array[i] = -20 + random.nextInt(40);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println("Число массива №" + (i + 1) + ": " + array[i]);
            i++;
        }
        if (Math.abs(min) > Math.abs(max)) {
            System.out.println("Минимальный элемент по модулю, который больше максимального: " + min);
        } else if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Максимальный элемент по модулю, который больше максимального: " + max);
        }
        else {
            System.out.println("Элементы по модулю совпали :)");
        }
    }
}
