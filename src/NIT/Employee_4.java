package NIT;

import Chapter_8.GetRandomNumber;

import java.util.Random;

public class Employee_4 implements Runnable{
    int number;
    int order = 1;
    int headNum = 0,tailNum = 0;
    public void setNumber(int num) {
        number = num;
    }
    public void run() {
        while(true) {
            String name = Thread.currentThread().getName(); //currentThread
            order++;
            switch (name){
                case "headDoor":{
//                    int []a1 = GetRandomNumber.getRandomNumber(1,32);
                    java.util.Random r1 = new Random();
//                    int i1 = r1.nextInt(5);
                    System.out.println("编号为：" + order +"的员工从前门入场，拿到的双色球彩票号码是：" /*+ i1*/);
                    number--;headNum++;
                    break;}
                case "tailDoor":{
//                    int []a2 = GetRandomNumber.getRandomNumber(1,32);
                    System.out.println("编号为：" + order +"的员工从后门入场，拿到的双色球彩票号码是：" /*+
                            java.util.Arrays.toString(a2)*/);
                    number--;tailNum++;
                    break;}
            }
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e) { }  //interruptedException
            if(number<=0){
                break;
            }
        }
        System.out.println("从前门入场" + headNum + "人");
        System.out.println("从后门入场" + tailNum + "人");
    }
}
