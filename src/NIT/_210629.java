package NIT;

import java.io.*;
import java.util.StringTokenizer;

public class _210629 {
    public static void main(String[] args) {
        File fRead = new File("digit.txt");
        try {
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            int countLine = 0;
            while ((str = bufferRead.readLine()) != null) {
                countLine++;
                StringTokenizer fenxi = new StringTokenizer(str);
                int count = fenxi.countTokens();
                int max = 0;
                for (int i = 0; i < count; i++) {
                    String st1 = fenxi.nextToken();
                    int temp = Integer.parseInt(st1);
                    if (temp > max) max = temp;
                }
                System.out.println("第" + countLine + "行最大为" + +max);
            }
            in = new FileReader(fRead);//要再写入一个文件读取
            bufferRead =new BufferedReader(in);
            String s = null;
            while ((s = bufferRead.readLine()) != null) {
                System.out.println(s);
            }
            bufferRead.close();
            in.close();
        }
        catch(IOException e) {
            System.out.println(e.toString());
        }
    }
}
