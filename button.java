import java.awt.*;
class simple{
    
    simple(){
        Frame frame = new Frame("simple App");
        Label label = new Label("gopi");
        Button btn = new Button("click me!");
        //Button btn2 = new Button("click me!");
        TextField text = new TextField("enter your name : ");
        TextArea text1 = new TextArea("enter your name ");
        Checkbox ch = new Checkbox("male");
        Choice ch1 = new Choice();
        ch1.add("india");
        ch1.add("USA");
        ch1.add("UAE");
        frame.add(btn);
        frame.add(ch);
        frame.add(ch1);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(200,200);
    }
    
}
public class button{
    public static void main(String[] args){
        new simple();
        
    }
}