import java.util.Arrays;
import java.util.Random;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            Arrays.sort(arr[i]);
        }

        System.out.println("Отсортированные массивы:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Массив " + i + ": " + Arrays.toString(arr[i]));
        }

        System.out.println("\nЭлементы по диагонали:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Элемент " + i + " массива " + i + ": " + arr[i][i]);
        }
    }
}



