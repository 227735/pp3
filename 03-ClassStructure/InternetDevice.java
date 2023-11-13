public class InternetDevice {
    private String name;
    private boolean connected;
    private static int connectedDevices;

    public InternetDevice(String name){
        this.name = name;
        this.connected = false;
    }

    public void connect(){
        if (!connected){
            connected=true;
            connectedDevices++;
            System.out.println(name + " został/a podłączony/a do Internetu.");
        } else {
            System.out.println(name + " jest już podłączony/a do Internetu.");
        }
        }   

    public void disconnect(){
        if (connected){
            connected=false;
            connectedDevices--;
            System.out.println(name + " został/a odłączony/a do Internetu.");
        } else {
            System.out.println(name + " jest już odłączony/a do Internetu.");
        }
        
    }
    public boolean isConnected(){
        return connected;
    }

    public void displayStatus(){
        String status = connected ? "podłączony" : "niepodłączony";
        System.out.println(name + " jest " + status + " do Internetu.");
    }

    public static void displayConnections(){
        System.out.println("Liczba urządzeń podłączonych do Internetu: " + connectedDevices);
    }
        
}
