package Exper;
import java.util.*;

public class Exper2_4 {
    public static void main(String[] args) {
        System.out.println("��ֱ�����ʵ��x1 ��x ����x1��y ����y1������");
        System.out.println("��ֱ�����ʵ��x2 ��x ����x2��y ����y2������");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();double y1=sc.nextDouble();
        double x2 = sc.nextDouble();double y2=sc.nextDouble();
        MyPoint2_4 p1 = new MyPoint2_4(x1,y1);
        MyPoint2_4 p2 = new MyPoint2_4(x2,y2);
        System.out.println("x1��x2֮��ľ���Ϊ��" + p1.getD(p2));
    }
}
