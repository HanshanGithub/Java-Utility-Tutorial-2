package Chapter_5;

class A1 {
    Object get() {
       return null; //����һ���ն���
    }
}
class B1 extends A1 {
    Integer get() {
       return new Integer(100);//����һ��Integer����
    }
}
public class Example5_6 {
    public static void main(String args[]) {
       B1 b=new B1();
       Integer t=b.get();
       System.out.println(t.intValue());   
    } 
}
