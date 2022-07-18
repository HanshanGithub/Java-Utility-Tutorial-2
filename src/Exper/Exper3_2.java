package Exper;

public class Exper3_2 {
    public static void main(String[] args) {
        People3_2 person;
        ChinaPeople3_2 tin = new ChinaPeople3_2();
        person = tin;
        System.out.print("中国人打招呼:");
        person.speakHello();
        tin.chinaGongFu();
        System.out.println("中国人平均身高：" + person.averageHeight() + " 平均体重：" + person.averageWeight());

        SiChuanPeople3_2 xin = new SiChuanPeople3_2();
        person = xin;
        System.out.print("四川人打招呼:");
        person.speakHello();
        xin.siChuanHot();
        System.out.println("四川人平均身高：" + person.averageHeight() + " 平均体重：" + person.averageWeight());

        AmericanPeople3_2 tinH = new AmericanPeople3_2();
        person = tinH;
        System.out.print("美国人打招呼:");
        person.speakHello();
        tinH.americanBoxing();
        System.out.println("美国人平均身高：" + person.averageHeight() + " 平均体重：" + person.averageWeight());
    }
}
