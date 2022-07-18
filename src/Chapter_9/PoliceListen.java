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
      textShow.append(str+"的长度:"+str.length()+"\n");
      String words[] = str.split(" |\\p{Punct}|\\p{Digit}");//？？？
      int num = words.length;
      textShow.append(str+"的单词个数:"+num+"\n");
      //textInput.remove(8);
   }
}
