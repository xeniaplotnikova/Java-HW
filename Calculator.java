import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Над какими числами хотите произветси операцию?: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        if (num1 >10000)
            System.out.println("Как много...Надеюсь, это шоколадки");
        System.out.print("\nКакую операцию хотите произвести? (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ой... Кажется, вы ввели не математическую операцию...");
                return;
        }
        System.out.print("\nЛовите ваш результат:)\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\nНадеюсь, результат вас порадовал:)\n");
    }
}

