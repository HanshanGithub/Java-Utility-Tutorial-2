package NIT;

import java.util.*;

/*class Student_2 implements Comparable {
    String name;
    int grade;
    Student_2 (String name_,int grade_) {
        name = name_;
        grade = grade_;
    }
    public int compareTo(Object b) {
        Student_2 stu = (Student_2)b;
        return (this.grade - stu.grade);
    }
}*/
public class Reve_2 {
    public static void main(String[] args) {
        TreeSet<Student_2> tree = new TreeSet<>();
        Student_2[]stu = new Student_2[4];
        stu[0] = new Student_2("lisa",88);
        stu[1] = new Student_2("pick",90);
        stu[2] = new Student_2("lemen",96);
        stu[3] = new Student_2("julys",77);
        for(int i=0;i<4;i++)
            tree.add(stu[i]);
        Iterator<Student_2> iter = tree.iterator();//interator
        while(iter.hasNext()) {
            Student_2 te = iter.next();
            System.out.println("Ãû×Ö" + te.name + " "
                                + "·ÖÊı"+ te.grade);
        }
    }
}
