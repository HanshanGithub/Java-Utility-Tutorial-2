package Chapter_3;

public class Example3_1 {
    public static void main(String args[]) {
        char a1='ʮ',a2='��',a3='��',a4='��';
        char secret='A';
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("����:"+a1+a2+a3+a4);
        a1=(char)(a1^secret);
        a2=(char)(a2^secret);
        a3=(char)(a3^secret);
        a4=(char)(a4^secret);
        System.out.println("ԭ��:"+a1+a2+a3+a4);
    }
}
//AbstractClassDemo.java Դ�������£�
/*abstract class Shape { //���������Shape �ͳ��󷽷�display
abstract void display();
} class Circle extends Shape {
void display() { //ʵ�ֳ�����ķ���
System.out.println("Circle");
}
} class Rectangle extends Shape {
void display() { //ʵ�ֳ�����ķ���
System.out.println("Rectangle");
}
} class Triangle extends Shape {
void display() { //ʵ�ֳ�����ķ���
System.out.println("Triangle");
}
}
public class Example3_1{
public static void main(String args[]){
(new Circle()).display(); //�����������������ö�Ӧ��display ����
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
	 System.out.print("����:" + name);
	 System.out.print(" ����:" + age);
	 }
	 void outOther() {
	 System.out.print(" ��ͥסַ:" + address);
	 System.out.print(" �绰:" + tel);
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
	 System.out.println(" ѧУ��" + school);
	 }
	 public static void main(String args[]) {
	 Son son = new Son("Tom", 15);
	 son.address = "��ˮ��";
	 son.school = "����";
	 son.tel = "66123456";
	 son.out();
	 }
	 }*/