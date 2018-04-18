
 
import java.net.InetAddress;
import java.net.UnknownHostException;
 
 class HostName {
    public static void main(String a[]){
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}