package Exper;
import java.util.*;

public class Exper2_4 {
    public static void main(String[] args) {
        System.out.println("请分别输入实数x1 的x 坐标x1和y 坐标y1两个数");
        System.out.println("请分别输入实数x2 的x 坐标x2和y 坐标y2两个数");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();double y1=sc.nextDouble();
        double x2 = sc.nextDouble();double y2=sc.nextDouble();
        MyPoint2_4 p1 = new MyPoint2_4(x1,y1);
        MyPoint2_4 p2 = new MyPoint2_4(x2,y2);
        System.out.println("x1与x2之间的距离为：" + p1.getD(p2));
    }
}
