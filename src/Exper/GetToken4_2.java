package Exper;
import java.util.*;

public class GetToken4_2 {
    public static double getScore(String socre) {
        String regex = "[\\D.]+";
        socre = socre.replaceAll(regex,"#");
        StringTokenizer fenxi = new StringTokenizer(socre,"#");
        double total = 0;
        while (fenxi.hasMoreElements()) {
            String item = fenxi.nextToken();
            double so = Double.parseDouble(item);
            total += so;
        }
        return total;
    }
}
