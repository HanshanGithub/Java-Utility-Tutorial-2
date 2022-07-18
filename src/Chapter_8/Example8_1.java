package Chapter_8;

public class Example8_1 {
  public static void main(String args[]) {
       String hello = "你好";
       String testOne = "你"+"好";             //【代码1】
       System.out.println(hello == testOne);   //输出结果是true
       System.out.println("你好" == testOne);  //输出结果是true
       System.out.println("你好" == hello);    //输出结果是true
       String you = "你";
       String hi = "好";
       String testTwo = you+hi;                //【代码2】
       System.out.println(hello == testTwo);   //输出结果是false
       System.out.println("地址测试");
       //str.getClass()+"@"+str.hashCode()
       System.out.println("hello地址："+hello.hashCode());
       System.out.println("testTwo地址："+testTwo.hashCode());
       String testThree = you+hi;                       
       System.out.println(testTwo == testThree); //输出结果是false
    }
}
