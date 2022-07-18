package NIT;

/*
public class _210701   {
    public static void main(String[] args) {
        int a = 3/2;
        System.out.println(a);
    }
}
*/
import java.util.*;
import java.io.*;

public class _210701 {
    public static void main(String []args) {
        File fIn = new File("digit.txt");
        try {
            Reader in = new FileReader(fIn);
            BufferedReader buIn = new BufferedReader(in);
            String str = null;
            int count = 0;
            while((str=buIn.readLine())!=null) {
                count++;
                StringTokenizer data = new StringTokenizer(str);
                int max = 0;
                String tem = null;
                while((tem = data.nextToken())!=null) {
                    tem = data.nextToken();
                    int temp = Integer.parseInt(tem);
                    if(temp>max) max = temp;
                }
                System.out.println("第" + count + "行最大值为" + max);
            }
            in.close();
            buIn.close();
        }
        catch (IOException e) {
            System.out.println("File rad Error" + e);
        }
    }
}