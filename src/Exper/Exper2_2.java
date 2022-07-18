package Exper;
import java.util.*;     //Scanner类

public class Exper2_2 {
    public static void main(String[] args) {
        System.out.println("请分别输入复数C1 的实部a1 和虚部b1 两个数");
        System.out.println("请分别输入复数C2 的实部a2 和虚部b2 两个数");
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();double b1=sc.nextDouble();
        double a2 = sc.nextDouble();double b2=sc.nextDouble();
        Complex2_2 c1 = new Complex2_2(a1,b1);
        c1.ToString("c1");
        Complex2_2 c2 = new Complex2_2(a2,b2);
        c2.ToString("c2");
        Complex2_2 c3;
        c3 = c2.addComp(c1);
        c3.ToString("c2+c1");
        c3 = c1.subComp(c2);
        c3.ToString("c1-c2");
        c3 = c1.multiComp(c2);
        c3.ToString("c1*c2");
        boolean same = c1.equalComp(c2);
        System.out.println(same?"c1=c2":"c1!=c2");
    }
}
