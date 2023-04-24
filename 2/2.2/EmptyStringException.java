import java.util.Scanner;

public class EmptyStringExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Введите строку: ");
        input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}