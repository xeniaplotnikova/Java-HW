package com.company;

public class Main {

    public static void main(String[] args) {
    //Ввести три числа с клавиатуры x, y, z
    int x = 8;
	int y = 8;
    int z = 9;

    //Найти и вывести в консоль среднее арифметическое этих чисел

    double avg = ((x+y+z)/3.d);
    System.out.println("Среднее арифметиеское: " + avg);

    //Разделить среднее арифметическое на 2 и округлить в меньшую сторону;

    double avg2 = avg/2;
    int avgDiv = (int) avg2;
    System.out.println("Деление среднего арифметического на 2 с округлением в меньшую сторону: " + avgDiv);

    //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (avgDiv > 3)
            System.out.println("Программа выполнена корректно");

    }
}
