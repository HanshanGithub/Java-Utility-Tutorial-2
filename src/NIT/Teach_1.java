package NIT;
import java.util.*;

public class Teach_1 {
    String title, name, location;
    double price;
    Teach_1(String titile_,String name_, String location_,double price_){
        title = titile_;
        name = name_;
        location = location_;
        price = price_;
    }
}

class Disp_1{
//    ArrayList<Teach_1> array = new ArrayList<Teach_1>();
    public static void show(ArrayList<Teach_1> array ){
       /* for(int i=0;i<array.size();i++){
            System.out.println(array.get(i).title
                    +array.get(i).name
                    +array.get(i).location
                    +array.get(i).price);
        }*/
        Iterator<Teach_1> iter = array.iterator();
        while(iter.hasNext()){
            Teach_1 tem = iter.next();
            System.out.println("名称" + tem.title + " " +
                    "作者" + tem.name + " " +
                    "出版社" + tem.location + " " +
                    "价格" + tem.price);
        }
    }
}
