package Chapter_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame1 extends JFrame {
       Boy police;
       MyFrame1(String s) {
       super(s);
       police=new Boy();
       setBounds(100,100,200,300);
       setVisible(true);
       addWindowListener(police);   //�򴰿�ע�������
       validate();
    } 
}
class Boy extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}
public class Example9_13 {
   public static void main(String args[]) {
         new MyFrame1("����");
   } 
}
