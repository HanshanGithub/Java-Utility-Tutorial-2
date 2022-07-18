package Exper;
import java.util.*;


class EmployeeTest{
    static Employee4_3 []e=new Employee4_3[5];
    public static int averge(String type){
        int sum=0;
        for(int i=0;i<e.length;i++){
            if(type.equals("age")) sum=sum+e[i].age;
            if(type.equals("salary")) sum=sum+e[i].salary;
        }
        return sum/e.length;
    }
    public static int mini(String type){
        int min=0;
        if(type.equals("age")){
            min=e[0].age;
            for(int i=1;i<e.length;i++){
                if(e[i].age<min) min=e[i].age;
            }
        }
        if(type.equals("salary")){
            min=e[0].salary;
            for(int i=1;i<e.length;i++){
                if(e[i].salary<min) min=e[i].salary;
            }
        }
        return min;
    }
    public static int maxi(String type){
        int max=0;
        if(type.equals("age")){
            max=e[0].age;
            for(int i=1;i<e.length;i++){
                if(e[i].age>max) max=e[i].age;
            }
        }
        if(type.equals("salary")){
            max=e[0].salary;
            for(int i=1;i<e.length;i++){
                if(e[i].salary>max) max=e[i].salary;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        e[0]=new Employee4_3("张三",1,25,1500);
        e[1]=new Employee4_3("李四",2,30,1900);
        e[2]=new Employee4_3("王五",3,45,18000);
        e[3]=new Employee4_3("赵六",4,28,2500);
        e[4]=new Employee4_3("钱七",8,32,3000);
        Scanner sc = new Scanner(System.in);
        String data [] = new String[2];
        data[0] = new String(sc.next());
        data[1] = new String(sc.next());
        if(data[0].equals("age"))
        {
            if(data[1].equals("min")){
                System.out.println("最小年龄是:"+mini("age"));//25
            }
            else if(data[1].equals("max")){
                System.out.println("最大年龄是:"+maxi("age"));//45
            }
            else if(data[1].equals("avg")){
                System.out.println("平均年龄是:"+averge("age"));//32
            }
            else
                System.out.println("输入错误");
        }
        else if(data[0].equals("salary"))
        {
            if(data[1].equals("min")){
                System.out.println("最低工资是:"+mini("salary"));
            }
            else if(data[1].equals("max")){
                System.out.println("最高工资是:"+maxi("salary"));
            }
            else if(data[1].equals("avg")){
                System.out.println("平均工资是:"+averge("salary"));
            }
            else
                System.out.println("输入错误");
        }
        else
            System.out.println("输入错误");
    }
}