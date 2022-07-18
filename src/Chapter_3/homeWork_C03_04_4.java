package Chapter_3;

public class homeWork_C03_04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 1;
		for(int i=1;sum<8888;i++) {
			sum = sum+i;
			n = i;
		}
		System.out.println("1+2+3+···+n<8888的最大正整数n="+n);
	}
}