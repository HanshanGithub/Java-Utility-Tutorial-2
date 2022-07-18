package Exper;

public class Exper2_1 {
    public static void main(String[] args) {
        Circle2_1 c1 = new Circle2_1(3.1);
        Ladder2_1 l1 = new Ladder2_1(2,3,5);
        System.out.println("C1(半径:3.1),周长为："+c1.getC());
        System.out.println("C1(半径:3.1)面积为："+c1.getS());
        System.out.println("l1(上底：下底：3，高：5)面积为："+l1.getS());
    }
}
