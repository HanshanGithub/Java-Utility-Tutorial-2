package NIT;

import java.util.StringTokenizer;

//--------------------
//System.out.println("\n2021-05-04 _2");
public class Example {
    public static void main(String[] args) {
        System.out.println("2021-05-04 _1");
        String regex = "\\djava\\w{1,}";
        String str1 = "88javaookk";
        String str2 = "9javaHello";
        if (str1.matches(regex)) {
            System.out.println(str1);
        }
        if (str2.matches(regex)) {
            System.out.println(str2);
        }

        //-------------
        System.out.println("\n2021-05-04 _2");
        byte d[] = "abc我们喜欢篮球".getBytes();
        System.out.println(d.length); //【代码1】
        String s = new String(d, 0, 7);
        System.out.println(s); //【代码2】
        //-------------
        System.out.println("\n2021-05-04 _3");
        Runtime runtime = Runtime.getRuntime();
        long free = runtime.freeMemory();
        System.out.println("Java虚拟机可用空内存 " + free + " bytes");
        long total = runtime.totalMemory();
        System.out.println("Java虚拟机占总内存 " + total + " bytes");
        long n1 = System.currentTimeMillis();
        for (int i = 1; i < 100; i++) {
            int j = 2;
            for (; j <= i / 2; j++) {
                if (i % j == 0) break;
            }
            if (j > i / 2) System.out.print(" " + i);
        }
        long n2 = System.currentTimeMillis();
        System.out.printf("\n循环用时：" + (n2 - n1) + "毫秒\n");
        free = runtime.freeMemory();
        System.out.println("Java虚拟机可用空内存 " + free + " bytes");
        total = runtime.totalMemory();
        System.out.println("Java虚拟机占总内存 " + total + " bytes");
        //-------------
        System.out.println("\n2021-05-25_1");
        int[] arr = new int[]{8, 2, 1, 0, 3, 9, 7};//17321999980
        int[] index = new int[]{2, 6, 4, 1, 2, 5, 5, 5, 5, 0, 3};
        String tel = "";
        for (int i : index) {
            tel += arr[i];
        }
        System.out.println("电话号码：" + tel);
        //-------------

    }
}
