package Exper;

public class Company3_3 {
    Employee3_3 sta1 = new YearWorker3_3();
    Employee3_3 sta2 = new MonthWorker3_3();
    Employee3_3 sta3 = new WeekWorker3_3();
    Employee3_3 staff[] = new Employee3_3[] {sta1,sta2,sta3};
    //Employee3_3 staff[] = new Employee3_3[3];     //不报错，如何赋值
    double total = 0;
    String wage = "";
    double pay(int a, int b, int c) {
        total = 1*sta1.earnings()*a + 12*sta2.earnings()*b + 48*sta3.earnings()*c;
        wage = String.valueOf(total);
        String tem = "";
        for(int i=0;i<wage.length();i++) {

        }
        return total;
    }
}
