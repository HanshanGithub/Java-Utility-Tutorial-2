package NIT;
import java.lang.*;
import java.util.Random;

//生成随机数测试
public class _210617 {
    public static void main(String[] args) {
        Random r1 = new Random();
        int number = r1.nextInt(100 ) + 1;
        System.out.println(number);
    }

}
