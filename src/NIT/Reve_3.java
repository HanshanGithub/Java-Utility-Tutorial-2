package NIT;
import java.util.*;

public class Reve_3 {
    public static void main(String[] args) {
        TreeMap<StorageKey_3,Storage_3> map1 = new TreeMap<>();
        double []price = {43.3, 52.1,54.2,33.8};
        double []volum = {128,64,256,32};
        String []name = {"A","B","C","D"};
        Storage_3 []sto = new Storage_3[4];
        for(int i=0;i<4;i++)
            sto[i] = new Storage_3(name[i],price[i],volum[i]);//����U�������
        StorageKey_3 []sKey = new StorageKey_3[4];
        for(int i=0;i<4;i++)
            sKey[i] = new StorageKey_3(sto[i].price);//���۸�����
        for(int i=0;i<4;i++)
            map1.put(sKey[i],sto[i]);
        System.out.println("���۸�����");
        Collection<Storage_3> coll = map1.values();
        Iterator<Storage_3> iter = coll.iterator();
        while(iter.hasNext()){
            Storage_3 tem = iter.next();
            System.out.println(tem.name + "��Ʒ�۸�:" + tem.price +
                    " ����:" + tem.volum);
        }
    }
}
