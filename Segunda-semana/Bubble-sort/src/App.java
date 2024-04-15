import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> diario = new ArrayList<String>();
        diario.add("Maria");
        diario.add("João");
        diario.add("André");
        diario.add("Henrique");
        diario.add("Bruno");
        diario.add("Gabriela");

        Collections.sort(diario);
        System.out.println(diario);

    }
}
