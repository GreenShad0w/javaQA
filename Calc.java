import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueCalc = true;

        do {
            System.out.println("Введите первое число: ");
            double A = readDouble(input);

            System.out.println("Введите второе число: ");
            double B = readDouble(input);

            System.out.println("Введите операцию (+, -, *, /): ");
            String OP = input.nextLine();

            try {
                double result = calculate(A, B, OP);
                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            System.out.println("Хотите продолжить? (да/нет): ");
            String cont = input.nextLine();
            if (cont.equalsIgnoreCase("нет")) {
                continueCalc = false;
            }
        } while (continueCalc);

        input.close();
    }

    private static double calculate(double A, double B, String OP) {
        switch (OP) {
            case "+":
                return A + B;
            case "-":
                return A - B;
            case "*":
                return A * B;
            case "/":
                if (B == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно.");
                }
                return A / B;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + OP);
        }
    }

    private static double readDouble(Scanner input) {
        while (true) {
            try {
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа. Попробуйте снова.");
            }
        }
    }
}
