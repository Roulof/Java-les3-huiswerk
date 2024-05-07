// Importeren van HashMap utility
import java.util.HashMap;
import java.util.Map;

// Public class voor de Translator
public class Translator {

    //HashMap variabel met integer en string met de naam numericAlpha
    private HashMap<Integer,String> numericAlpha = new HashMap<>();

    //Translator class met de alphabetic en numeric parameters
    public Translator(String[] alphabetic, Integer[] numeric) {

        //for loop die begint bij 0 en doorgaat tot de lengte van de numeric of alphabetic array uit main
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    //Translate methode die een string terugstuurd
    public String translate(Integer number) {
        return numericAlpha.get(number);
    }

}
