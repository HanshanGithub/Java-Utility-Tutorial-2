package Chapter_5;

class aStudent {
   int number;String name;
   aStudent() {
	   System.out.println("No information");
   }
   aStudent(int number,String name) {
      this.number=number;
      this.name=name;
      System.out.println("我的名字是:"+name+ "学号是:"+number);
   }
 }
class aUniverStudent extends aStudent {
   boolean 婚否;
   aUniverStudent(int number,String name,boolean b) {
	   //super();
	   super(number,name);
      婚否=b;
      System.out.println("婚否="+婚否);
   }
}
public class Example5_8 {
   public static void main(String args[]) {
      aUniverStudent zhang=new aUniverStudent(9901,"何晓林",false);
   }
}


