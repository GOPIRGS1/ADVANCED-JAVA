import java.net.*;
public class DatagramClient {
    public static void main(String[] args) throws Exception{

        DatagramSocket sc = new DatagramSocket(9999);

        byte[] buffer = new byte[1024];
        DatagramPacket pack = new DatagramPacket(buffer, 1024);

        sc.receive(pack);//use instance of object only

        String msg = new String(pack.getData(),0,pack.getLength());//null values avoided
        System.out.println(msg);

        sc.close();//use instance of object only

    }
    
}
