package Exper;
import java.util.*;

public class Exper3_1 {
    public static void main(String[] args) {
        Truck3_1 tem = new Truck3_1();
        System.out.println("�������ֻ���(����:31.2������:19.09��ϴ�»�:122.13)��������");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("��������Ϊ��" + tem.sumTotal(a,b,c));
    }
}
