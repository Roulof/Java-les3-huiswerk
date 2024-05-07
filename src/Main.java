import com.sun.java.accessibility.util.Translator;

// Main public class
public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "0"};

        Translator translator = new Translator(alphabetic, numeric);

    }
}
