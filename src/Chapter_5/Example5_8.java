package Chapter_5;

class aStudent {
   int number;String name;
   aStudent() {
	   System.out.println("No information");
   }
   aStudent(int number,String name) {
      this.number=number;
      this.name=name;
      System.out.println("�ҵ�������:"+name+ "ѧ����:"+number);
   }
 }
class aUniverStudent extends aStudent {
   boolean ���;
   aUniverStudent(int number,String name,boolean b) {
	   //super();
	   super(number,name);
      ���=b;
      System.out.println("���="+���);
   }
}
public class Example5_8 {
   public static void main(String args[]) {
      aUniverStudent zhang=new aUniverStudent(9901,"������",false);
   }
}


