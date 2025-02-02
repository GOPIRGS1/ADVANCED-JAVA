import java.awt.*;
import java.awt.event.*;

public class WindowClosing extends Frame {
    WindowClosing() {
        Button btn = new Button("Click me!...");
        btn.setBounds(100, 100, 100, 30);
        add(btn);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowClosing();
    }
}

