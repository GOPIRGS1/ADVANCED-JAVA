import java.awt.*;
class simple{
    
    simple(){
        Frame frame = new Frame("simple App");
        Label label = new Label("this is text");
       
        label.setBounds(50,60,100,20);

        //Button btn2 = new Button("click me!");
        Button btn = new Button("click me!");
        btn.setBounds(30,120,100,30);
        frame.add(btn);

        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
    
}
public class setBounds{
    public static void main(String[] args){
        new simple();
        
    }
}