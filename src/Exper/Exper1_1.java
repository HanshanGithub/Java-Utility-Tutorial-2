package Exper;

public class Exper1_1 {
    public static void main(String[] args) {
        int result = 0;
        for(int i=0;i<10;i++){
            int tem = 1;
            for(int j=i+1;j>0;j--){
                tem = tem * j;
            }
            result = result + tem;
        }
        System.out.println("1!+2!+3!бнбн+10!="+result);
    }
}
