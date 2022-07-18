package NIT;

import java.math.*;
import java.util.*;

class Test {
    String name;
    double price;
    Test (String name_,double price_) {
        name = name_;
        price = price_;
    }
}
public class _210701_1 {
    public static void main(String []args) {
        Test []num = new Test[4];
        int []data = {1,21,3,41,12,33,14};
        num[0] = new Test("A",1.1);
        num[1] = new Test("B",2.2);
        num[2] = new Test("C",3.3);
        num[3] = new Test("D",4.4);
        ArrayList<Test> nit = new ArrayList<>();
        for(int i=0;i<4;i++)
            nit.add(num[i]);
//        nit.sort(data);
    }
}
