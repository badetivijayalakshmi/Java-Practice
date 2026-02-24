interface SmartDevice{

    public void turnOn();
    public void turnOff();
    public void getStatus();
}
interface Rechargable{
    public void charge();
}

class SamrtPhone implements SmartDevice,Rechargable{
    public void turnOn(){
        System.out.println("Phone is turning ON");
    }
    public void turnOff() {
        System.out.println("Smartphone is turning OFF");
    }

    public void getStatus() {
        System.out.println("Smartphone is working properly");
    }

    public void charge() {
        System.out.println("Smartphone is charging");
    }
}
public class Main {
    public static void main(String[] args) {
        SmartDevice s;
        s = new SamrtPhone();
        s.turnOn();
        s.getStatus();

    }
}
