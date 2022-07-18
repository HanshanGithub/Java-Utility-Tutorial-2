package Chapter_4;

class NXiyoujiRenwu {
    float height,weight;
    String head, ear;
    void speak(String s) {
       System.out.println(s);
    }
}

public class Example4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NXiyoujiRenwu  zhubajie;       //声明对象
        zhubajie = new NXiyoujiRenwu(); //为对象分配变量(使用new和默认的构造方法)
        zhubajie.speak("The objtctive is going!\n");
	}

}
