import java.awt.*;
import java.awt.event.*;

public class MouseExample implements MouseListener{

    Label status;
    Frame frame;

    MouseExample(){
        status = new Label("This is a Mouse!");
        status.setSize(200,30);

        frame = new Frame("Mouse listener");
        frame.add(status);
        frame.addMouseListener(this);

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

            frame.addWindowListener(new WindowAdapter() {
          
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public static void main(String[] args){
        new MouseExample();
    }

    public void mouseClicked(MouseEvent e){
            status.setText("Mouse Clicked");

    }
    public void mousePressed(MouseEvent e){
        status.setText("Mouse Pressed");

    }
    public void mouseReleased(MouseEvent e){
        status.setText("Mouse Relased");

    }
    public void mouseEntered(MouseEvent e){
        status.setText("Mouse Entered");

    }
    public void mouseExited(MouseEvent e){
        status.setText("Mouse Exited");

    }
}
