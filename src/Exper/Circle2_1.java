package Exper;

public class Circle2_1 {
    private double R,C,S;
    Circle2_1(double r) {
        R=r;
    }
    Circle2_1() { }
    public double getC() {
        return 2 * 3.14 * R;
    }
    public double getS() {
        return 3.14*R *R;
    }
}
