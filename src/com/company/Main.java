package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Задайте массив из 5 любых целых чисел.
        //Поменяйте местами первый и последний элемент в массиве.
        int[] nums = {1, 4, 6, 8, 9};
        int c;
        c = nums[0];
        nums[0] = nums[4];
        nums[4] = c;
        System.out.println(nums[0] + ";" + nums[4]);
        //Вывести в консоль результат суммы первого и среднего элемента.
        //Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.

            int a = nums[nums.length / 2];



            System.out.println("Результат суммы первого и среднего элемента: " + (nums[0]+a));
        }
    }



