package Chapter_3;

public class Example3_1 {
    public static void main(String args[]) {
        char a1='十',a2='点',a3='进',a4='攻';
        char secret='A';
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("密文:"+a1+a2+a3+a4);
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("原文:"+a1+a2+a3+a4);
    }
}
//AbstractClassDemo.java 源代码如下：
/*abstract class Shape { //定义抽象类Shape 和抽象方法display
abstract void display();
} class Circle extends Shape {
void display() { //实现抽象类的方法
System.out.println("Circle");
}
} class Rectangle extends Shape {
void display() { //实现抽象类的方法
System.out.println("Rectangle");
}
} class Triangle extends Shape {
void display() { //实现抽象类的方法
System.out.println("Triangle");
}
}
public class Example3_1{
public static void main(String args[]){
(new Circle()).display(); //定义无名对象来调用对应的display 方法
(new Rectangle()).display();
(new Triangle()).display();
}
*/
 
 /*public class Father {
	 String name, address, tel;
	 int age;
	 public Father(String name, int age) {
	 this.name = name;
	 this.age = age;
	 }
	 void out() {
	 System.out.print("姓名:" + name);
	 System.out.print(" 年龄:" + age);
	 }
	 void outOther() {
	 System.out.print(" 家庭住址:" + address);
	 System.out.print(" 电话:" + tel);
	 }
	 }
	 class Son extends Father {
	 String school;
	 public Son(String name, int age) {
	 super(name, age);
	 }
	 void out() {
	 super.out();
	 super.outOther();
	 System.out.println(" 学校：" + school);
	 }
	 public static void main(String args[]) {
	 Son son = new Son("Tom", 15);
	 son.address = "金水区";
	 son.school = "九中";
	 son.tel = "66123456";
	 son.out();
	 }
	 }*/