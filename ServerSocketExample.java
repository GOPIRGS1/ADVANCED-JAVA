import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class ServerSocketExample {
    public static void main(String[] args) throws IOException{
        ServerSocket sc1 = new ServerSocket(999);
        Socket sc = sc1.accept();

        DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
        dos.writeUTF("Hi client!");
        dos.flush();
        dos.close();

    }
    
}
