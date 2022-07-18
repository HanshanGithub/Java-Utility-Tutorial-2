package Exper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetSocre4_2 {
    public static double getTotalSocre(String score) {
        Scanner tem = new Scanner(score);
        tem.useDelimiter("[\\D.]+");
        double sum=0;
        while(tem.hasNext()){
            try{double score1=tem.nextDouble();
                sum=sum+score1;
            }
            catch(InputMismatchException exp){
                String t=tem.next();
            }
        }
        return sum;
    }
}
