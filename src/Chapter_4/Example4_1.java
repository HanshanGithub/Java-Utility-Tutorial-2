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
		NXiyoujiRenwu  zhubajie;       //��������
        zhubajie = new NXiyoujiRenwu(); //Ϊ����������(ʹ��new��Ĭ�ϵĹ��췽��)
        zhubajie.speak("The objtctive is going!\n");
	}

}
