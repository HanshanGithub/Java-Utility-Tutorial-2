package Exper;

public class Exper1_5 {
    public static void main(String[] args) {
        int result = 0;
        int basic = 8;
        int RES = 0;
        for(int i=0;i<10;i++) {
            result = result * 10 + basic;
            RES += result;
        }
        System.out.println("8+88+888…前10项之和=" + RES);
    }
}
