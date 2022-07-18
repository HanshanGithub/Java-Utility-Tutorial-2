package Exper;

public class Exper1_3 {
    public static void main(String[] args) {
        System.out.println("do-while求合：");
        int n = 1;
        double result = 0;
        do{
            int tem = n;
            double t = 1;
            do{
                t = t * tem;
                tem--;
            }while (tem > 0);
            n++;
            result = result + 1/t;
        }while(n <= 20);
        System.out.println("1!+1/2!+1/3!+……+1/20!=" + result);

        System.out.println("for求合：");
        double Restle = 0;
        for(int i=1;i<20;i++) {
            double tem = 1;
            for(int j=i;j>0;j--) {
                tem = tem * j;
            }
            Restle = Restle + 1/tem;
        }
        System.out.println("1!+1/2!+1/3!+……+1/20!=" + Restle);
    }
}
