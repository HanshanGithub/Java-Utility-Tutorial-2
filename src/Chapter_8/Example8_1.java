package Chapter_8;

public class Example8_1 {
  public static void main(String args[]) {
       String hello = "���";
       String testOne = "��"+"��";             //������1��
       System.out.println(hello == testOne);   //��������true
       System.out.println("���" == testOne);  //��������true
       System.out.println("���" == hello);    //��������true
       String you = "��";
       String hi = "��";
       String testTwo = you+hi;                //������2��
       System.out.println(hello == testTwo);   //��������false
       System.out.println("��ַ����");
       //str.getClass()+"@"+str.hashCode()
       System.out.println("hello��ַ��"+hello.hashCode());
       System.out.println("testTwo��ַ��"+testTwo.hashCode());
       String testThree = you+hi;                       
       System.out.println(testTwo == testThree); //��������false
    }
}
