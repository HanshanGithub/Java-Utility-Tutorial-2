package Exper;
import java.util.*;

public class Exper3_1 {
    public static void main(String[] args) {
        Truck3_1 tem = new Truck3_1();
        System.out.println("输入三种货物(电脑:31.2、电视:19.09、洗衣机:122.13)的数量：");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("货车载重为：" + tem.sumTotal(a,b,c));
    }
}
