package Chapter_15;

import java.util.*;
class Student_1 implements Comparable {
   int height=0;
   String name;
   Student_1(String n,int h) {
      name=n;
      height = h;
     
   }
   public int compareTo(Object b) { // 两个Student对象相等当且仅当二者的height值相等
     Student_1 st=(Student_1)b;
     return (this.height-st.height);
   }
}
public class Example15_4 {
    public static void main(String args[ ]) { 
       List<Student_1> list = new LinkedList<Student_1>();
       list.add(new Student_1("张三",188));
       list.add(new Student_1("李四",178));
       list.add(new Student_1("周五",198));
       Iterator<Student_1> iter=list.iterator();
       System.out.println("排序前,链表中的数据");
       while(iter.hasNext()){
          Student_1 stu=iter.next();
          System.out.println(stu.name+ "身高:"+stu.height);
       }
       Collections.sort(list);
       System.out.println("排序后,链表中的数据");
       iter=list.iterator();
       while(iter.hasNext()){
          Student_1 stu=iter.next();
          System.out.println(stu.name+ "身高:"+stu.height);
       }
       Student_1 zhaoLin = new Student_1("zhao xiao lin",178);
       int index = Collections.binarySearch(list,zhaoLin,null);
       if(index>=0) {
            System.out.println(zhaoLin.name+"和链表中"+list.get(index).name+"身高相同");
       }
    }
}

