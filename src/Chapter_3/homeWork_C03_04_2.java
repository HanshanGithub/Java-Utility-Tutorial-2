package Chapter_3;

public class homeWork_C03_04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("forº∆À„");
		double sum = 0;
		for(int i=1;i<=20;i++){
			double caclu = 1;
			for(int j=i;j>0;j--){
				caclu = caclu*j;
			}
			sum = sum+1/caclu;
		}
		System.out.println("1+1/2!+1/3!+...+1/20!="+sum);
		
		System.out.println("\ndo-whileº∆À„");
		int I = 1;
		double SUM = 0;
		do {
			int J = I;
			double CAC = 1;
			do {
				
				CAC = CAC*J;
				J--;
			}while(J>0);
			SUM = SUM+1/CAC;
			I++;
		}while(I<20);
		System.out.println("1+1/2!+1/3!+...+1/20!="+SUM);
	}
}
