package Chapter_10;

public class EncryptAndDecrypt {
    String encrypt(String courceString,String password){    //�����㷨���μ�8..5��
        char []p = password.toCharArray();
        int n = p.length;
        char []c = courceString.toCharArray();
        int m = c.length;
        for (int k=0;k<m;k++){
            int mima = c[k]+p[k%n];     //����
            c[k] = (char)mima;
        }
        return new String(c);   //��������
    }
    String decrypt(String courceString,String password) {
        char []p = password.toCharArray();
        int n = p.length;
        char []c = courceString.toCharArray();
        int m = c.length;
        for(int k=0;k<m;k++){
            int mima = c[k]-p[k%n];
            c[k] = (char)mima;
        }
        return new String(c);
    }
}
