package Chapter_4;

class NPoint {
    int x,y;
   NPoint(int a,int b) {
    	x=a;
       y=b;
    }
    void speak(String s) {
    
    	System.out.println(s+"What's this.");
    }
}
public class Example4_2 {
   public static void main(String args[]) {
      NPoint p1=new NPoint(10,10); 
      NPoint p2=new NPoint(23,35);                //声明对象p1和p2
      //p1=new Point(10,10);         //为对象分配变量(使用new和类中的构造方法)
     // p2=new Point(23,35);        //为对象分配变量(使用new和类中的构造方法)
      p1.speak("How\t");
      p2.speak("what\t");
   }
}

