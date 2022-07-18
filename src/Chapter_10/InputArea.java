package Chapter_10;

import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class InputArea extends JPanel implements ActionListener {
   File f=null;
   RandomAccessFile out;
   Box baseBox,boxV1,boxV2; 
   JTextField name,email,phone;
   JButton button;
   InputArea(File f) {
       setBackground(Color.cyan);
       this.f=f;
       name=new JTextField(12);
       email=new JTextField(12);
       //email.setEditable(false);
       phone=new JTextField(12);
       button=new JButton("¼��");
       button.addActionListener(this);
       boxV1=Box.createVerticalBox();
       boxV1.add(new JLabel("��������"));
       boxV1.add(Box.createVerticalStrut(8));
       boxV1.add(new JLabel("����email"));
       boxV1.add(Box.createVerticalStrut(8));
       boxV1.add(new JLabel("����绰"));
       boxV1.add(Box.createVerticalStrut(8));
       boxV1.add(new JLabel("����¼��"));
       boxV2=Box.createVerticalBox();
       boxV2.add(name);
       boxV2.add(Box.createVerticalStrut(8));
       boxV2.add(email);
       boxV2.add(Box.createVerticalStrut(8));
       boxV2.add(phone);
       boxV2.add(Box.createVerticalStrut(8));
       boxV2.add(button);
       baseBox=Box.createHorizontalBox();
       baseBox.add(boxV1);
       baseBox.add(Box.createHorizontalStrut(10)); //�ݲ������;
       baseBox.add(boxV2);
       add(baseBox); 
   }
   public void actionPerformed(ActionEvent e) {
      try{
           RandomAccessFile out=new RandomAccessFile(f,"rw");
           if(f.exists())
              {  long length=f.length();
                 out.seek(length);
              }
           out.writeUTF("\n����:"+name.getText());
           out.writeUTF("\teamil:"+email.getText());
           out.writeUTF("\t�绰:"+phone.getText());
           out.close();
           //name.actionPropertyChanged(e,"Reload");
      }
      catch(IOException ee){}
   }
}
