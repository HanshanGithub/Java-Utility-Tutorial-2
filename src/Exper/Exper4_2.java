package Exper;

public class Exper4_2 {
    public static void main(String[] args) {
        //Scanner tem = new Scanner(System.in);
        System.out.println("ʹ��Scanner���ȡ������");
        String socre = "��ѧ87�֣�����76�֣�Ӣ��96��";
        System.out.println("ԭ�ַ�����" + socre);
        double total = GetSocre4_2.getTotalSocre(socre);
        System.out.println("�ܷ�Ϊ��" + total);
        System.out.println("ƽ����Ϊ��" + total/3);
        System.out.println("----------------------\nʹ��StringTokenizer���ȡ������");
        System.out.println("ԭ�ַ�����" + socre);
        double sumAll = GetToken4_2.getScore(socre);
        System.out.println("�ܷ�Ϊ��" + sumAll);
        System.out.println("ƽ����Ϊ��" + sumAll/3);
    }
}
