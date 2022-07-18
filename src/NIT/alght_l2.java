package NIT;

import java.math.BigInteger;

public class alght_l2 {
    static String AddLongInteger(String addend, String augend) {
        BigInteger add1 = new BigInteger(addend);
        BigInteger add2 = new BigInteger(augend);
        BigInteger result = new BigInteger("0");
        result = add1.add(add2);
        String temp = result.toString();
        return temp;
    }
}
