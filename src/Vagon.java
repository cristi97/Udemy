abstract public class Vagon {
    protected int passengerCapacity,postalCapacity;
    public abstract void open();
    public abstract void close();
    public String toString(){
        return passengerCapacity+" "+postalCapacity;
    }
}
class CalatoriA extends Vagon{
    public CalatoriA(){
        passengerCapacity=40;
        postalCapacity=300;
    }
    public void open(){
        System.out.println("Open!");
    }
    public void close(){
        System.out.println("Close!");
    }
}

class CalatoriB extends Vagon{
    public CalatoriB(){
        passengerCapacity=50;
        postalCapacity=400;
    }
    public void open(){
            System.out.println("Open!");
    }
    public void close(){
        System.out.println("Close!");
    }

    public void openWindows(){
        System.out.println("Windows Opened!");
    }
}
