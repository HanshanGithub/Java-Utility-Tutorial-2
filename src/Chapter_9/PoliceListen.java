package Chapter_9;

import java.awt.event.*;
import javax.swing.*;
public class PoliceListen implements MyCommandListener {
   JTextField textInput;
   JTextArea textShow;
   public void setJTextField(JTextField text) {
      textInput = text;
   }
   public void setJTextArea(JTextArea area) {
      textShow = area;
   } 
   public void actionPerformed(ActionEvent e) {
      String str=textInput.getText();
      textShow.append(str+"�ĳ���:"+str.length()+"\n");
      String words[] = str.split(" |\\p{Punct}|\\p{Digit}");//������
      int num = words.length;
      textShow.append(str+"�ĵ��ʸ���:"+num+"\n");
      //textInput.remove(8);
   }
}
