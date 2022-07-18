package Chapter_12;

/*public class After_test {
    public static void main(String args[]) {
        Target target =new Target();
        Thread thread =new Thread(target);
        thread.start();
//        target.start();   //´íÎó
        for(int i= 0;i<=10;i++) {
            System.out.println("yes"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException exp){}
        }
    }
}
class Target implements Runnable{
    public void run() {
        for(int i= 0;i<=10;i++) {
            System.out.println("ok"+i);
            try{  Thread.sleep(1000);
            }
            catch(InterruptedException exp){}
        }
    }
}*/

/*
public class E {
    public static void main(String args[]) {
        Target target =new Target();
        Thread thread =new Thread(target);
        target.run();
        for(int i= 0;i<=10;i++) {
            System.out.println("yes"+i);
            try{  Thread.sleep(100);
            }
            catch(InterruptedException exp){}
        }
    }
}
class Target implements Runnable{
    public void run() {
        for(int i= 0;i<=10;i++) {
            System.out.println("ok"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exp){}
        }
    }
}*/

/*
public class E {
    public static void main(String args[]) {
        Target target =new Target();
        Thread thread1 =new Thread(target);
        Thread thread2 =new Thread(target);
        thread1.start();
//        thread2.start();
        try{  Thread.sleep(1000);
        }
        catch(Exception exp){}
        thread2.start();
    }
}
class Target implements Runnable{
    int i = 1;
    public void run() {
        i *= 10;
        System.out.println("i="+i);
    }
}*/

public class E {
    public static void main(String args[]) {
        System.out.println((int)'Äã');
        System.out.println((int)'ÎÒ');
        System.out.println((int)'Ëû');
    }
}