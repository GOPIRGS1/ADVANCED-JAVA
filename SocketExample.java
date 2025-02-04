import java.net.Socket;
import java.io.IOException;
import java.io.DataInputStream;
public class SocketExample{
    public static void main(String[] args) throws IOException{
        Socket sc = new Socket("localhost",999);
        DataInputStream ds = new DataInputStream(sc.getInputStream());
        String msg = ds.readUTF();
        System.out.println("the server says : "+msg);

    }
}