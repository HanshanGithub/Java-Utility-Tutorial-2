package Chapter_12;

public class Example12_3 {
   public static void main(String args[ ]) {
      House_1 house1 = new House_1();
      house1.setWater(20);
      Thread dog,cat;
      dog=new Thread(house1);
      cat=new Thread(house1);  //cat和dog的目标对象相同
      dog.setName("狗");
      cat.setName("猫"); 
      dog.start();
      cat.start();
   }
}
