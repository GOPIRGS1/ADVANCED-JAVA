import java.net.*;
import java.net.DatagramSocket;
public class UDPSender{
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        String msg = "Hi client!";

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
        datagramSocket.send(datagramPacket); 
        datagramSocket.close();

    }
}