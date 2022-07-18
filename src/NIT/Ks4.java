package NIT;

import java.util.*;
import java.io.*;

public class Ks4 {
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
                int num = data.countTokens();
                int max = 0;
                for(int i=0;i<num;i++){
                	String tem = data.nextToken();
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