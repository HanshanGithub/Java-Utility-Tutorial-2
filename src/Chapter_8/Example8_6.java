package Chapter_8;

public class Example8_6{
   public static void main(String args[]) {
      char [] a,c; 
      String s="1945��8��15���ǿ�սʤ����";
      a=new char[4];
      //s.getChars(11,15,a,0);
     s.getChars(2,5,a,1);
      System.out.println(a);
      c="ʮһ�����ڼ䣬ѧУ���ż���".toCharArray();
      for(int i=0;i<c.length;i++)
        System.out.print(c[i]);
   }
}

