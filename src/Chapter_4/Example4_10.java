package Chapter_4;

public class Example4_10 { 
   public static void main(String args[]) {
       NLader.下底=100;     //NLader的字节码被加载到内存,通过类名操作类变量
       NLader laderOne=new NLader();
       NLader laderTwo=new NLader();
       laderOne.设置上底(28);
       laderTwo.设置上底(66);
       System.out.println("laderOne的上底:"+laderOne.获取上底());
       System.out.println("laderOne的下底:"+laderOne.获取下底());
       System.out.println("laderTwo的上底:"+laderTwo.获取上底());
       System.out.println("laderTwo的下底:"+laderTwo.获取下底());
    } 
}
