package Exper;

public class Exper4_1 {
    public static void main(String[] args) {
        String tem = "a3b1c2d0,1e9.0l9;1w2i2o1y3!";
        System.out.println("ԭ�ַ�����" + tem);
        String regex = "\\D";
        tem = tem.replaceAll(regex,"");
        System.out.println("�����Ĵ�����Ϊ��" + tem);
    }
}
