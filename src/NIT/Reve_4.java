package NIT;

//import Exper.Employee4_3;

public class Reve_4 {
    public static void main(String[] args) {
        Employee_4 emp = new Employee_4();
        emp.setNumber(50);
        Thread head,tail;
        head = new Thread(emp);
        tail = new Thread(emp);
        head.setName("headDoor");
        tail.setName("tailDoor");
        head.start();
        tail.start();
    }
}
