package Exper;

public class Exper4_2 {
    public static void main(String[] args) {
        //Scanner tem = new Scanner(System.in);
        System.out.println("使用Scanner类读取分数：");
        String socre = "数学87分，物理76分，英语96分";
        System.out.println("原字符串：" + socre);
        double total = GetSocre4_2.getTotalSocre(socre);
        System.out.println("总分为：" + total);
        System.out.println("平均分为：" + total/3);
        System.out.println("----------------------\n使用StringTokenizer类读取分数：");
        System.out.println("原字符串：" + socre);
        double sumAll = GetToken4_2.getScore(socre);
        System.out.println("总分为：" + sumAll);
        System.out.println("平均分为：" + sumAll/3);
    }
}
