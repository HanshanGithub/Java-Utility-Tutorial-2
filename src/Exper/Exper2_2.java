package Exper;
import java.util.*;     //Scanner��

public class Exper2_2 {
    public static void main(String[] args) {
        System.out.println("��ֱ����븴��C1 ��ʵ��a1 ���鲿b1 ������");
        System.out.println("��ֱ����븴��C2 ��ʵ��a2 ���鲿b2 ������");
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
