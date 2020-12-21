import java.util.Scanner;

public class ConvMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара (для разделения долларов и центов используйте запятую): ");
        double rate = scanner.nextDouble();
        System.out.println("Введите сумму в рублях для конвертации (для разделения рублей и копеек используйте запятую): ");
        double rub = scanner.nextDouble();
        System.out.printf("Ваша сумма в долларах = %.2f", rate * rub );
    }
}


