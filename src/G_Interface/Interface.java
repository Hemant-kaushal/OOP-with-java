package G_Interface;

interface Camera{
    void TakeSnap();
    void RecordVideo();

    default void Recorrd(){                 // DEFAULT METHOD USE IN INTERFACE
        System.out.println("Recording in 4k");
    }
}

interface wifi{
    String[] getNetwork();
    void ConnectToNetwork(String network);
}

class CellPhone{
    void CallNumber(int number){
        System.out.println("Calling " +number);
    }
    void PickClal(){
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements wifi, Camera{
    public void TakeSnap(){
        System.out.println("Takuing Snap ");
    }
    public void RecordVideo(){
        System.out.println("Taking Video Snap");
    }
    public String[] getNetwork(){
        System.out.println("Geting List Of Network");
        String[] networkList = {"Jio5G", "airtel5G", "Vodaphone4G"};
        return networkList;
    }
    public void ConnectToNetwork(String network){
        System.out.println("Connect to " +network);
    }
}
public class Interface {
    public static void main(String[] args){
        SmartPhone ms = new SmartPhone();
        ms.Recorrd();
        String[] ar = ms.getNetwork();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
