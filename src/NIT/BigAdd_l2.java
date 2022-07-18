package NIT;
import java.math.BigInteger;
import java.util.*;

public class BigAdd_l2 {
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
        System.out.println("输入加数和被加数：");
//        BigInteger add1 = new BigInteger();
        String addend = ca.next();
        String augend = ca.next();
        String out = alght_l2.AddLongInteger(addend,augend);
        System.out.println(out);
    }
}
