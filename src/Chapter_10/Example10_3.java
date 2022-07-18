package Chapter_10;

import java.io.*;
public class Example10_3 {
   public static void main(String args[]) {
      try{ 
           Runtime ce=Runtime.getRuntime();
           File file=new File("c:/windows","Notepad.exe");
           ce.exec(file.getAbsolutePath());
           file=new File("C:\\Program Files\\Internet Explorer","IEXPLORE www.sina.com.cn");
           //C:\\Users\\86173\\AppData\\Local\\Google\\Chrome\\Application
          //C:\Program Files\Internet Explorer
           ce.exec(file.getAbsolutePath());
      }
      catch(Exception e) {
         System.out.println(e);
      } 
   } 
}
