package Chapter_5;

class A2 {
  final double PI=3.1415926;// PI�ǳ���
  public double getArea(final double r) {
     return PI*r*r;
  }
  public final void speak() {
     System.out.println("���ã�How's everything here ?");
  } 
}
public class Example5_9 {
   public static void main(String args[]) {
      A2 a=new A2();
      System.out.println("�����"+a.getArea(100));
      a.speak();     
   }
}
