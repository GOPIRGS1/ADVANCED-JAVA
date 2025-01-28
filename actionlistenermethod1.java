import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class simple{
    
    simple(){
        Frame frame = new Frame("Form");
        Label email = new Label("E-mail : ");
        email.setBounds(30,150,100,30);

        TextField emailinput  = new TextField();
        emailinput.setBounds(160,150,200,30);

        Label password = new Label("Password : ");
        password.setBounds(30,220,100,30);

        TextField passinput  = new TextField();
        passinput.setBounds(160,220,200,30);

        Label age = new Label("Age : ");
        age.setBounds(30,290,100,30);

        TextField ageinput  = new TextField();
        ageinput.setBounds(160,290,200,30);

        Button btn = new Button("Sumbit");
        btn.setBounds(160,370,60,25);

        ActionListener SumbitListen = new ActionListener(){
            public void actionPerformed (ActionEvent e){
                System.out.println(emailinput.getText());
                System.out.println(passinput.getText());
                System.out.println(ageinput.getText());
            }
        };

        btn.addActionListener(SumbitListen);

        frame.add(email);
        frame.add(password);
        frame.add(age);

        frame.add(emailinput);
        frame.add(passinput);
        frame.add(ageinput);

        frame.add(btn);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,550);
    }
    
}
public class actionlistenermethod1{
    public static void main(String[] args){
        new simple();
        
    }
}