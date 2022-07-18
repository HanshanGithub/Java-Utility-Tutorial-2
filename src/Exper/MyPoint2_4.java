package Exper;
import java.lang.Math;
public class MyPoint2_4 {
    private double x,y;
    public MyPoint2_4( ){
        x = 0;
        y = 0;
    }
    public MyPoint2_4(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double getD(MyPoint2_4 p1) {
        double tem = Math.pow((this.x-p1.x),2) + Math.pow((this.y-p1.y),2);
        return Math.sqrt(tem);
    }
}
