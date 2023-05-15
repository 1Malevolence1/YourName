import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите имя: ");
        String user = scanner.nextLine();
        String name = "";
        int count = 0;

        while (!name.equals(user)) {
            name = "";
            for (int i = 0; i < user.length(); i++) {
                char letter = RandomLetter();
                name += letter;

            }

            if (name.equals(user)) {
                System.out.println(name);
                break;
            }
            System.out.println(name + ", " + count);
            count++;
        }
        System.out.println(name + ", " + count);
    }


    public static char RandomLetter() {
        Random random = new Random();
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        int randomInt = random.nextInt(alphabet.length());
        return alphabet.charAt(randomInt);

    }
}