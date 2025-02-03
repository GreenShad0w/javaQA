import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println();
        System.out.println("Максимальное число в массиве - " + max);
    }
}


