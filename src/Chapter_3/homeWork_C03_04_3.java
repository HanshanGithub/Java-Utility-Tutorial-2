package Chapter_3;

public class homeWork_C03_04_3 {
	//求1-10的阶乘之和
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++){
			int caclu = 1;
			for(int j=i;j>0;j--){
				caclu = caclu*j;
			}
			sum = sum + caclu;
		}
		System.out.println("1!+2!+3!+...+10!="+sum);
}
}