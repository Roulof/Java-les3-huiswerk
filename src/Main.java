
import java.util.Scanner;

// Main public class
public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "0"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String ongeldig = "Ongeldige invoer";
        Scanner scanner = new Scanner(System.in);

        while (play) {

            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                play = false;
            }

            else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();

                if (number >= 0 && number <= 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " : " + result);
                }

                else { System.out.println(ongeldig);}


            }
        }

    }
}
