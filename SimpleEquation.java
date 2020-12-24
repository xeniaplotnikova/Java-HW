package com.company;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String input = scanner.nextLine();
        if (input.charAt(4) == 'x') {
            char firstNum = input.charAt(0);
            char secondNum = input.charAt(2);
            if (input.charAt(1) == '+') {
                //Если введена задача сложить два звестных числа
                System.out.print("Вывод: " + (Character.digit(firstNum, 10) + Character.digit(secondNum, 10)));
            } else {
                //Если введена задача вычесть из одного известного числа второе известное
                System.out.print("Вывод: " + (Character.digit(firstNum, 10) - Character.digit(secondNum, 10)));
            }
        } else if (input.charAt(1) == '+') {
            char secondNum = input.charAt(4);
            char firstNum;
            if (input.charAt(0) == 'x') {
                firstNum = input.charAt(2);
            } else {
                firstNum = input.charAt(0);
            }
            //Если известно одно слагаемое (не важно, первое или второе) и результат
            System.out.print("Вывод: " + (Character.digit(secondNum, 10) - Character.digit(firstNum, 10)));
        } else {
            char secondNum = input.charAt(4);
            if (input.charAt(0) == 'x'){
                char firstNum = input.charAt(2);
                //Если введена задача из неизветсного вычесть изветное, также известен результат
                System.out.println("Вывод: " + (Character.digit(secondNum, 10) + Character.digit(firstNum, 10)));
            } else {
                char firstNum = input.charAt(0);
                //Если при вычитании известен результат, но не известно второе из вычитаемых
                System.out.println("Вывод: " + (Character.digit(firstNum, 10) - Character.digit(secondNum, 10)));
            }
        }
    }
}