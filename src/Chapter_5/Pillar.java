package Chapter_5;

public class Pillar {
    Geometry  bottom;        //bottom�ǳ�����Geometry�����ı���
    double height;
    Pillar (Geometry bottom,double height) {
        this.bottom=bottom; 
        this.height=height;
    }
    public double getVolume() {
        if(bottom==null) {
           System.out.println("û�е�,�޷��������");
           return -1;
        }
        return bottom.getArea()*height; //bottom���Ե���������д��getArea����
    }
}





