package Chapter_8;

public class Example8_7 {
    public static void main(String args[]) {
       byte d[]="Java你好".getBytes();
       //char D[]="Java你好"; //error
       System.out.println("数组d的长度是:"+d.length);
       String s=new String(d,6,2); //输出：好
       System.out.println(s);
       s=new String(d,0,6);
       System.out.println(s);   //输出：Java你
    }
}


