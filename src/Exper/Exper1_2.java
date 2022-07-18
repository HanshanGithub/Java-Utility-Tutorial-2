package Exper;
import java.lang.Math;

public class Exper1_2 {
    public static void main(String[] args) {
        System.out.println("100内的素数为：");
        for(int n=1;n<=100;n++) {
            if(n<2) continue;
            if(n == 2) System.out.print(n + " ");
            if(n % 2 == 0) continue;
            double sq = Math.sqrt(n);
            boolean tem = true;
            for(int i=3;i<=sq;i+=2) {
                if(n%i==0){
                    tem = false;
                    break;
                }
            }
            if(tem == true)
                System.out.print(n + " ");
        }
    }
}
