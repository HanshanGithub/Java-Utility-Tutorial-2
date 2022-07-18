package Exper;

public class Truck3_1 {
    double total = 0;
    ComputeWeight3_1 x1 = new Computer3_1();
    ComputeWeight3_1 x2 = new Television3_1();
    ComputeWeight3_1 x3 = new WashMachine3_1();
    ComputeWeight3_1 [] x = new ComputeWeight3_1[]{x1,x2,x3};
    public double sumTotal(int a, int b, int c){
        total = x[0].computeWeight()*a + x[1].computeWeight()*b + x[2].computeWeight()*c;
        return total;
    }
}
