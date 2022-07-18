package NIT;
import java.util.*;

public class Reve_1_ {
    public static void main(String[] args) {
        Box_1_ box = new Box_1_();
        Thread box1 = new Thread(box);
        Thread box2 = new Thread(box);
        int []arr = {10,5,20,50,100,200,500,800,2,80,300};
        List<Integer> array = new ArrayList<>();
//        int x = arr.length;
        for(int x:arr) {
            Integer tem = new Integer(x);
            array.add(tem);
        }
        box.setPool(array);
        box1.setName("box1");
        box2.setName("box2");
        box1.start();
        box2.start();
    }
}
