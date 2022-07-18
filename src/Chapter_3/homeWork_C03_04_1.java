package Chapter_3;

public class homeWork_C03_04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cir = 8;
		double cac = cir;
		double sum = 0;
		for(int i=0;i<9;i++) {
			sum = sum+cac;
			cac = cac*10+cir;
		}
		System.out.println("8+88+888+···前10项之和="+sum);
	}

}
