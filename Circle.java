import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double radius = input.nextDouble();

        double Plochad = Math.PI * radius * radius;

        System.out.println("Площадь круга: " + Plochad);
    }
}
