package Chapter_5;

class  类人猿 {
   void crySpeak(String s) {
       System.out.println(s); 
   }  
}
class iPeople extends 类人猿 {
   void computer(int a,int b) { 
      int c=a*b;
      System.out.println(c); 
   }
   void crySpeak(String s) {
      System.out.println("***"+s+"***"); 
   }  
}
public class Example5_10 {
   public static void main(String args[]) {
      类人猿 monkey;
      iPeople geng = new iPeople();   
      monkey = geng ; //monkey是People对象geng的上转型对象
      monkey.crySpeak("I love this game");//等同于geng.crySpeak("I love this game");
      iPeople people=(iPeople)monkey; //把上转型对象强制转化为子类的对象
      //people people; people = monkey;
      people.computer(10,10);
   }
}
