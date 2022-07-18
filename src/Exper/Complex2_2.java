package Exper;

public class Complex2_2 {
    double r,i;
    Complex2_2(double x,double y) {
        r = x;
        i = y;
    }
    Complex2_2( ) {
        r = 0;
        i = 0;
    }
    public void ToString(String tem) {
        System.out.println(tem+" = "+r+(i>=0?"+":"")+i+"i");
    }
    public Complex2_2 addComp(Complex2_2 c1) {
        //Complex2_2 tem = new Complex2_2();
        double R = this.r + c1.r;
        double I = this.i + c1.i;
        return new Complex2_2(R,I);
    }
    public Complex2_2 subComp(Complex2_2 c1) {
        double R = this.r - c1.r;
        double I = this.i - c1.i;
        return new Complex2_2(R,I);
    }
    public Complex2_2 multiComp(Complex2_2 c1) {
        double R = this.r * c1.r + this.i * c1.i;
        double I = this.i + c1.r + this.r * c1.i;
        return new Complex2_2(R,I);
    }
    public boolean equalComp(Complex2_2 c1) {
        if(this.r == c1.r&&this.i == c1.i )
            return true;
        return false;
    }
}
