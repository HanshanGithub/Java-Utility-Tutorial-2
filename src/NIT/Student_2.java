package NIT;

public class Student_2 implements Comparable{
    String name;
    int grade;
    Student_2(String name_, int grade_) {
        name = name_;
        grade = grade_;
    }
    public int compareTo(Object b) {
        Student_2 stu = (Student_2)b;
        return (this.grade - stu.grade);
    }
}
