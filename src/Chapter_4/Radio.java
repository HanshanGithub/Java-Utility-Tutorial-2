package Chapter_4;

public class Radio {
    void openRadio(Battery battery){
        battery.electricityAmount = battery.electricityAmount - 10;
    }
}