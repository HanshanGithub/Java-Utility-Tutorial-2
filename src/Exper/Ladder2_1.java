package Exper;

public class Ladder2_1 {
    Ladder2_1(double U,double D,double H) {
        this.U=U;
        this.D=D;
        this.H=H;
    }
    private double U,D,H,S;
    public double getS() {
        return (U+D)*H/2;
    }
}
