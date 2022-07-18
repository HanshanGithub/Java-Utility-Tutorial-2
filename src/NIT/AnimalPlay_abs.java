package NIT;
import java.util.*;

public class AnimalPlay_abs {
    static void playGame(List arr) {
        Iterator<Animal_abs> iter = arr.iterator();
        String re = "ÔÚ×öÓÎÏ·£¡";
        while(iter.hasNext()) {
            Animal_abs tem = iter.next();
            System.out.println(tem.getter() + re);
        }
    }
}
