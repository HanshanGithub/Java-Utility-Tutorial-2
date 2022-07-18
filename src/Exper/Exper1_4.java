package Exper;
//import java.lang.String;
public class Exper1_4 {
    public static void main(String[] args) {
        int n = 1000;
        for(int i=1;i<=n;i++) {
            int count = 0;
            String tem = i + " it's factors are ";
            for(int j=1;j<i;j++) {
                if(i%j==0) {
                    count += j;
                    tem = tem + j +",";
                }
            }
            if(i==count){
                System.out.println(tem);
            }
        }
    }
}
