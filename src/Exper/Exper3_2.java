package Exper;

public class Exper3_2 {
    public static void main(String[] args) {
        People3_2 person;
        ChinaPeople3_2 tin = new ChinaPeople3_2();
        person = tin;
        System.out.print("�й��˴��к�:");
        person.speakHello();
        tin.chinaGongFu();
        System.out.println("�й���ƽ����ߣ�" + person.averageHeight() + " ƽ�����أ�" + person.averageWeight());

        SiChuanPeople3_2 xin = new SiChuanPeople3_2();
        person = xin;
        System.out.print("�Ĵ��˴��к�:");
        person.speakHello();
        xin.siChuanHot();
        System.out.println("�Ĵ���ƽ����ߣ�" + person.averageHeight() + " ƽ�����أ�" + person.averageWeight());

        AmericanPeople3_2 tinH = new AmericanPeople3_2();
        person = tinH;
        System.out.print("�����˴��к�:");
        person.speakHello();
        tinH.americanBoxing();
        System.out.println("������ƽ����ߣ�" + person.averageHeight() + " ƽ�����أ�" + person.averageWeight());
    }
}
