import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num = readFloat("Введите дробное число:");
        System.out.println("Введенное число: " + num);
    }

    public static float readFloat(String message) {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean isNumber = false;

        while (!isNumber) {
            try {
                System.out.println(message);
                result = Float.parseFloat(scanner.nextLine());
                isNumber = true;
            } catch (NumberFormatException ex) {
                System.out.println("Некорректный ввод. Введите дробное число.");
            }
        }
        return result;
    }
}
