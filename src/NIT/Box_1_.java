package NIT;
import java.util.*;
public class Box_1_ implements Runnable{
    /*int []arr = {10,5,20,50,100,200,500,800,2,80,300};
    int x = arr.length;*/
    List<Integer> pool = new ArrayList<>();
    void setPool(List array) {
        pool = array;
    }
    public void run() {
        while(true) {
            String name = Thread.currentThread().getName();
            switch(name) {
                case "box1": {
                    Random r1 = new Random();
                    int index1 = r1.nextInt(pool.size());
                    System.out.println("抽奖箱1又产生了一个" + pool.get(index1) + "元大奖");
                    pool.remove(index1);
                    break;
                }
                case "box2": {
                    Random r2 = new Random();
                    int index2 = r2.nextInt(pool.size());
                    System.out.println("抽奖箱2又产生了一个" + pool.get(index2) + "元大奖");
                    pool.remove(index2);
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) { }
            if(pool.size()==0) {
                break;
            }
        }
    }
}

