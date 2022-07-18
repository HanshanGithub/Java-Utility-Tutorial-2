package Chapter_4;

class nStudent{
   int number;
}
public class Example4_21 { 
   public static void main(String args[ ]) { 
      nStudent stu[] = new nStudent[10];  //创建对象数组
      for(nStudent st:stu)
    	  System.out.println(st);
      for(int i=0;i<stu.length;i++) { 
        stu[i]=new nStudent();     //创建Student对象
        stu[i].number = 101+i;
      }
      for(int i=0;i<stu.length;i++) { 
         System.out.println(stu[i].number);
      }
      for(nStudent st:stu)
    	  System.out.println(st);
   } 
}




