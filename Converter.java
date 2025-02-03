import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму долларов: ");
        double dollars = input.nextDouble();

        double euro = 0.85 * dollars;

        System.out.println(dollars + " долларов - это " + euro + " евро");
    }
}

