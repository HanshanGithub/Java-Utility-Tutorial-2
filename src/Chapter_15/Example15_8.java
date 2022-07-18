package Chapter_15;

import java.util.*;
class Student_2 implements Comparable {
   int english=0;
   String name;
   Student_2(int english,String name) {
      this.name=name;
      this.english=english;
   }
   public int compareTo(Object b) {
      Student_2 st=(Student_2)b;
      return (this.english-st.english);
   }
}
public class Example15_8 {
  public static void main(String args[]) {
     TreeSet<Student_2> mytree=new TreeSet<Student_2>();
     Student_2 st1,st2,st3,st4,st5;
     st1=new Student_2(90,"赵一");
     st2=new Student_2(66,"钱二");
     st3=new Student_2(86,"孙三");
     st4=new Student_2(76,"李四");
     st5=new Student_2(76,"李五");
     mytree.add(st1);
     mytree.add(st2);
     mytree.add(st5);
     mytree.add(st3);
     mytree.add(st4);
     Iterator<Student_2> te=mytree.iterator();
     while(te.hasNext()) {
        Student_2 stu=te.next();
        System.out.println(""+stu.name+" "+stu.english);
     }
  }
}
