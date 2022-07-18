package Exper;
import java.util.*;

public class Exper3_3 {
    public static void main(String[] args) {
        Company3_3 gaoXun = new Company3_3();
        System.out.println(" 请输入Company中YearWorkerMonthWorkerWeekWorker各自人数：");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Company一年支付的薪水为："+gaoXun.pay(a,b,c));
    }
}
