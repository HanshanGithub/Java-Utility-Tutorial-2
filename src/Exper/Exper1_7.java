package Exper;


public class Exper1_7 {
    public static void main(String[] args) {
        System.out.println("100到1000包含数字5的全部偶数: ");
        int count = 0;
        for(int n=100;n<1000;n++) {
            if(n%2==0) {
                String tem = String.valueOf(n);
                if(tem.contains("5")){
                    count++;
                    System.out.print(tem + " ");
                    if(count%15==0) System.out.println("");
                }
            }
        }
    }
}
