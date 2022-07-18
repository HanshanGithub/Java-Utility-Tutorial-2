package NIT;

import java.util.*;

public class Reve_abs {
    public static void main(String[] args) {
        Dog_abs badi = new Dog_abs();
        Dog_abs doudou = new Dog_abs();
        badi.setter("Ð¡¹·°ÍµÏ");
        doudou.setter("Ð¡¹·¶¹¶¹");
        Cat_abs huahua = new Cat_abs();
        Cat_abs fanfan = new Cat_abs();
        huahua.setter("Ð¡Ã¨»¨»¨");
        fanfan.setter("Ð¡Ã¨·²·²");
        List<Animal_abs> arr = new ArrayList<>();
        arr.add(badi);
        arr.add(doudou);
        arr.add(huahua);
        arr.add(fanfan);
        AnimalPlay_abs.playGame(arr);
    }
}
