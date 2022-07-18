package Exper;
import java.util.*;

public class EmployeeTest4_3 {
    Employee4_3 []staff = new Employee4_3[5];
    public EmployeeTest4_3() {
        inital();
    }
    public void inital() {
        staff[0]=new Employee4_3("����",1,25,1500);
        staff[1]=new Employee4_3("����",2,30,1900);
        staff[2]=new Employee4_3("����",3,45,18000);
        staff[3]=new Employee4_3("����",4,28,2500);
        staff[4]=new Employee4_3("Ǯ��",8,32,3000);
        Scanner sc = new Scanner(System.in);
        String []data = new String[2];
        data[0] = sc.next();
        data[1] = sc.next();
        switch (data[0]) {
            case "age" : {
                switch (data[1]) {
                    case "min": {
                        System.out.println("��С������:"+min("age"));//25
                    }break;
                    case "max": {
                        System.out.println("���������:"+max("age"));//45
                    }break;
                    case "avg": {
                        System.out.println("ƽ��������:"+average("age"));//32
                    }break;
                    default: System.out.println("�������");
                }
            }break;
            case "salary" : {
                switch (data[1]) {
                    case "min": {
                        System.out.println("��С������:"+min("salary"));//25
                    }break;
                    case "max": {
                        System.out.println("�������:"+max("salary"));//45
                    }break;
                    case "avg": {
                        System.out.println("ƽ��������:"+average("salary"));//32
                    }break;
                    default: System.out.println("�������");
                }
            }
            default: System.out.println("�������");
        }
    }
    public int average (String type) {
        int sum = 0;
        /*for(int i=0;i<staff.length;i++) {
            if(type.equals("age"))
                sum += staff[i].age;
            if(type.equals("salary"))
                sum += staff[i].salary;
        }*/
        for(Employee4_3 s:staff) {
            if(type.equals("age"))
                sum += s.age;
            if(type.equals("salary"))
                sum += s.salary;
        }
        return sum/staff.length;
    }
    public int min(String type) {
        int min = 0;
        /*if(type.equals("age")) {
            min = staff[0].age;
            for(int i=1;i<staff.length;i++) {
                if(staff[i].age<min)
                    min = staff[i].age;
            }
        }
        if(type.equals("salary")) {
            min = staff[0].salary;
            for(int i=1;i<staff.length;i++) {
                if(staff[i].salary<min)
                    min = staff[i].salary;
            }
        }*/
        switch (type) {
            case "age" : {
                min = staff[0].age;
                for(int i=1;i<staff.length;i++) {
                    if(staff[i].age<min)
                        min = staff[i].age;
                }
            }break;
            case "salary" : {
                min = staff[0].salary;
                for(int i=1;i<staff.length;i++) {
                    if(staff[i].salary<min)
                        min = staff[i].salary;
                }
            }
        }
        return min;
    }
    public int max(String type) {
        int max = 0;
        /*if(type.equals("age")) {
            max = staff[0].age;
            for(int i=1;i<staff.length;i++) {
                if(staff[i].age>max)
                    max = staff[i].age;
            }
        }
        if(type.equals("salary")) {
            max = staff[0].salary;
            for(int i=1;i<staff.length;i++) {
                if(staff[i].salary>max)
                    max = staff[i].salary;
            }
        }*/
        switch (type) {
            case "age" : {
                max = staff[0].age;
                for(int i=1;i<staff.length;i++) {
                    if(staff[i].age>max)
                        max = staff[i].age;
                }
            }break;
            case "salary" : {
                max = staff[0].salary;
                for(int i=1;i<staff.length;i++) {
                    if(staff[i].salary>max)
                        max = staff[i].salary;
                }
            }
        }
        return max;
    }
}
