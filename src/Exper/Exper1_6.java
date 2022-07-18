package Exper;

public class Exper1_6 {
    public static void main(String[] args) {
        int res = 0;
        int ini = 0;
        do{
            ini++;
            res += ini;
        }while(res<8888);
        System.out.println("1+2+3…+n<8888的最大正整数n=" + (ini - 1));
    }
}
