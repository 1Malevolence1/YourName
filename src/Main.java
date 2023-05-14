import java.util.Random;

public class Main {
    public static void main(String[] args){
        int count = 0;
        while (count < 10){
            System.out.println(RandomLetter());
            count +=1;
        }
    }

    public static char RandomLetter(){
        Random random = new Random();
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        int randomInt = random.nextInt(alphabet.length());
        return alphabet.charAt(randomInt);

    }
}