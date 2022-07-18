package NIT;
import java.util.*;

public class Reve_1 {
    public static void main(String[] args) {
        ArrayList<Teach_1> nit = new ArrayList<>();
        Teach_1 t1 = new Teach_1("A","NIT","home",1.1);
        Teach_1 t2 = new Teach_1("B","NIT","home",2.2);
        Teach_1 t3 = new Teach_1("C","NIT","home",3.3);
        Teach_1 t4 = new Teach_1("D","NIT","home",4.4);
        nit.add(t1);
        nit.add(t2);
        nit.add(t3);
        nit.add(t4);
        Disp_1.show(nit);
    }
}
