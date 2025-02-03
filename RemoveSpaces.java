public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "Пример   строки с   пробелами  .";

        // Удаление
        String output = input.replaceAll("\\s+", "");

        // Вывод
        System.out.println("Исходная строка: " + input);
        System.out.println("Строка без пробелов: " + output);
    }
}




