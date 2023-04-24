import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения номер_телефона пол");

        String[] input = scanner.nextLine().split(" ");

        if (input.length != 6) {
            System.out.println("Ошибка! Неверное количество параметров.");
            return;
        }

        String lastName = input[0];
        String firstName = input[1];
        String middleName = input[2];
        String dateOfBirth = input[3];
        String phoneNumber = input[4];
        String gender = input[5];

        try {
            Person person = new Person(lastName, firstName, middleName, dateOfBirth, phoneNumber, gender);

            String fileName = lastName + ".txt";

            FileWriter writer = new FileWriter(fileName, true);
            writer.write(person.toString() + System.lineSeparator());
            writer.close();

            System.out.println("Данные записаны в файл " + fileName);
        } catch (InvalidDataFormatException e) {
            System.out.println("Ошибка! Неверный формат данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            e.printStackTrace();
        }
    }
}