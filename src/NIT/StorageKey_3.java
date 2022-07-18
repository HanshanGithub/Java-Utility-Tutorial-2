package NIT;

public class StorageKey_3 implements Comparable{
    double price = 0;
    StorageKey_3 (double d) {
        price = d;
    }
    public int compareTo(Object b) {
        StorageKey_3 tem = (StorageKey_3)b;
        if(this.price-tem.price==0)
            return -1;
        else
            return (int)((this.price-tem.price));
    }
}

class Storage_3 {
    double price,volum;
    String name;
    Storage_3(String name_, double price_,double volum_){
        price = price_;
        volum = volum_;
        name = name_;
    }
}
