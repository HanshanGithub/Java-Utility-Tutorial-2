package Chapter_9;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowActionEvent_0 extends JFrame {
   JTextField text;
   ActionListener listener;             //listener�Ǽ�����
   public WindowActionEvent_0() {
      setLayout(new FlowLayout());
      text = new JTextField(10); 
      add(text);
      listener = new ReaderListen();       //����������ַ������ȵļ�����
      text.addActionListener(listener);   //text���¼�Դ,listener�Ǽ�����
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
