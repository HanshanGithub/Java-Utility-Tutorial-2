package Chapter_12;

public class House implements Runnable {
   int waterAmount;       //��int����ģ��ˮ��
   Thread dog,cat;        //�߳���Ŀ�����ĳ�Ա
   House() {
      dog=new Thread(this);  //��ǰHouse������Ϊ�̵߳�Ŀ����� 
      cat=new Thread(this); 
   }
   public void setWater(int w) {
      waterAmount = w;
   }
   public void run() {     
      while(true) {
         Thread t=Thread.currentThread();
         if(t==dog) { 
              System.out.println("�ҹ���ˮ") ; 
              waterAmount=waterAmount-2;  //���ȵĶ�
//             System.out.println(" ʣ "+waterAmount);
         }
         else if(t==cat){
              System.out.println("��è��ˮ") ;   
              waterAmount=waterAmount-1;  //è�ȵ���
//             System.out.println(" ʣ "+waterAmount);
         }
         System.out.println(" ʣ "+waterAmount);
         try{  Thread.sleep(200);  //���ʱ��
         }
         catch(InterruptedException e){}  
         if(waterAmount<=0) {
                 return;    
         }  
     }
   }
}
