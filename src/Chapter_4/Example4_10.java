package Chapter_4;

public class Example4_10 { 
   public static void main(String args[]) {
       NLader.�µ�=100;     //NLader���ֽ��뱻���ص��ڴ�,ͨ���������������
       NLader laderOne=new NLader();
       NLader laderTwo=new NLader();
       laderOne.�����ϵ�(28);
       laderTwo.�����ϵ�(66);
       System.out.println("laderOne���ϵ�:"+laderOne.��ȡ�ϵ�());
       System.out.println("laderOne���µ�:"+laderOne.��ȡ�µ�());
       System.out.println("laderTwo���ϵ�:"+laderTwo.��ȡ�ϵ�());
       System.out.println("laderTwo���µ�:"+laderTwo.��ȡ�µ�());
    } 
}
