import java.util.ArrayList;
import java.util.List;

public class Baum {
    List<Ast> aeste;

    // Initialisierung Baum
    Baum() {
        aeste = new ArrayList<>();
        System.out.println("Baum: 3 Äste");
        for (int i = 1; i <= 3; i++) {
            aeste.add(new Ast());
        }
    }

    public List<Ast> getAeste() {
        return aeste;
    }
}
