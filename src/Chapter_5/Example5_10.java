package Chapter_5;

class  ����Գ {
   void crySpeak(String s) {
       System.out.println(s); 
   }  
}
class iPeople extends ����Գ {
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
      ����Գ monkey;
      iPeople geng = new iPeople();   
      monkey = geng ; //monkey��People����geng����ת�Ͷ���
      monkey.crySpeak("I love this game");//��ͬ��geng.crySpeak("I love this game");
      iPeople people=(iPeople)monkey; //����ת�Ͷ���ǿ��ת��Ϊ����Ķ���
      //people people; people = monkey;
      people.computer(10,10);
   }
}
