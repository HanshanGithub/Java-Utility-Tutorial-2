package NIT;

import java.util.*;

public class Reve_abs {
    public static void main(String[] args) {
        Dog_abs badi = new Dog_abs();
        Dog_abs doudou = new Dog_abs();
        badi.setter("С���͵�");
        doudou.setter("С������");
        Cat_abs huahua = new Cat_abs();
        Cat_abs fanfan = new Cat_abs();
        huahua.setter("Сè����");
        fanfan.setter("Сè����");
        List<Animal_abs> arr = new ArrayList<>();
        arr.add(badi);
        arr.add(doudou);
        arr.add(huahua);
        arr.add(fanfan);
        AnimalPlay_abs.playGame(arr);
    }
}
