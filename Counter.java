import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends Frame{

    TextField display;
    Button Reset;
    Button Increment;


    Counter(){

        display = new TextField("0");
        display.setBounds(50,50,100,30);

        Reset = new Button("Reset");
        Reset.setBounds(50,170,100,30);

        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                display.setText("0");
            }
            
        });

        Increment = new Button("Increment");
        Increment.setBounds(50,290,100,30);

        Increment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num = Integer.parseInt(display.getText());
                num++;
                display.setText(String.valueOf(num));
            }
            
        });
        
        add(display);
        add(Reset);
        add(Increment);

        setLayout(null);
        setSize(500,500);
        setTitle("Tally Counter");
        setVisible(true);



    }



    

     public static void main(String[] args){
         new Counter();

     }
    }


