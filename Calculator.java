import java.awt.*;
import java.awt.event.*;


public class Calculator extends Frame implements ActionListener {
    TextField display,disp;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button plus, minus, multiply, divide, equals, clear;

    Calculator() {
        // Display Field

        disp = new TextField("   💚 WELCOME TO SIMPLE CALCULATOR APP 💚 ");
        disp.setBounds(30,50,290,35);
        disp.setEditable(false);

        display = new TextField("0");
        display.setBounds(50, 110, 145, 50);
        display.setEditable(false);



        // Number Buttons
        btn0 = new Button("0");
        btn0.setBounds(50, 350, 50, 50);
        btn0.addActionListener(this);

        btn1 = new Button("1");
        btn1.setBounds(50, 290, 50, 50);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(110, 290, 50, 50);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(170, 290, 50, 50);
        btn3.addActionListener(this);
        

        btn4 = new Button("4");
        btn4.setBounds(50, 230, 50, 50);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(110, 230, 50, 50);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(170, 230, 50, 50);
        btn6.addActionListener(this);

        btn7 = new Button("7");
        btn7.setBounds(50, 170, 50, 50);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(110, 170, 50, 50);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(170, 170, 50, 50);
        btn9.addActionListener(this);

        // Operator Buttons
        plus = new Button("+");
        plus.setBounds(230, 170, 50, 50);
        plus.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(230, 230, 50, 50);
        minus.addActionListener(this);

        multiply = new Button("*");
        multiply.setBounds(230, 290, 50, 50);
        multiply.addActionListener(this);

        divide = new Button("/");
        divide.setBounds(230, 350, 50, 50);
        divide.addActionListener(this);

        equals = new Button("=");
        equals.setBounds(110, 350, 110, 50);
        equals.addActionListener(this);
        

        clear = new Button("C");
        clear.setBounds(230, 110, 50, 50);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Adding Components to Frame
        add(disp);
        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(plus);
        add(minus);
        add(multiply);
        add(divide);
        add(equals);
        add(clear);

        // Frame Properties
        setSize(350, 505);
        setTitle("Calculator App");
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn0){
            String expression = display.getText();
            expression = expression + "0";
            display.setText(expression);
        }
        if(e.getSource() == btn1){
            String expression = display.getText();
            expression = expression + "1";
            display.setText(expression);
        }
        if(e.getSource() == btn2){
            String expression = display.getText();
            expression = expression + "2";
            display.setText(expression);
        }
        if(e.getSource() == btn3){
            String expression = display.getText();
            expression = expression + "3";
            display.setText(expression);
        }
        if(e.getSource() == btn4){
            String expression = display.getText();
            expression = expression + "4";
            display.setText(expression);
        }
        if(e.getSource() == btn5){
            String expression = display.getText();
            expression = expression + "5";
            display.setText(expression);
        }
        if(e.getSource() == btn6){
            String expression = display.getText();
            expression = expression + "6";
            display.setText(expression);
        }
        if(e.getSource() == btn7){
            String expression = display.getText();
            expression = expression + "7";
            display.setText(expression);
        }
        if(e.getSource() == btn8){
            String expression = display.getText();
            expression = expression + "8";
            display.setText(expression);
        }
        if(e.getSource() == btn9){
            String expression = display.getText();
            expression = expression + "9";
            display.setText(expression);
        }
        if(e.getSource() == clear){

            display.setText("0");
        }
        if(e.getSource() == plus){
            String expression = display.getText();
            expression = expression + "+";
            display.setText(expression);
        }
        if(e.getSource() == minus){
            String expression = display.getText();
            expression = expression + "-";
            display.setText(expression);
        }
        if(e.getSource() == multiply){
            String expression = display.getText();
            expression = expression + "*";
            display.setText(expression);
        }
        if(e.getSource() == divide){
            String expression = display.getText();
            expression = expression + "/";
            display.setText(expression);
        }
  
        if(e.getSource() == equals){
            int a,b,i;
            char operator = '+';

            String expression = display.getText();
            String tempA = "";
            String tempB = "";

            for(i = 0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA += expression.charAt(i);
                }
                else{
                    operator = expression.charAt(i);
                    break;
                }
            }
            tempB += expression.substring(i+1);

            a=Integer.parseInt(tempA);
            b=Integer.parseInt(tempB);

            int result = 0;

            switch(operator){
                case '+':
                    result = a+b;
                    break;
                case '-':
                    result = a-b;
                    break;
                case '*':
                    result = a*b;
                    break;
                case '/':
                    result = a/b;
                    break;

            }
            display.setText(String.valueOf(result));

        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
