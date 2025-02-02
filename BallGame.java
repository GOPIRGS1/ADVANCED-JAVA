import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BallGame extends Frame implements MouseMotionListener{
    int circleX = 200,circleY =200;int circleRadius = 20;
 

    BallGame(){
        addMouseMotionListener(this);

        setSize(800,800);
        setLayout(null);
        setTitle("Ball Game ");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
           
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
 

    public void paint(Graphics g){
    
        g.setColor(Color.GREEN);
        g.fillOval(circleX,circleY,2*circleRadius,2*circleRadius);
    }

    public void mouseDragged(MouseEvent e){

    }
    public void mouseMoved(MouseEvent e){

        int x = e.getX();
        int y = e.getY();

        if(x < circleX+circleRadius){
            circleX++;
        }
        if(x > circleX + circleRadius){
            circleX--;

        }
        if(y < circleY+circleRadius ){
            circleY++;
        }
        if(y > circleY+circleRadius){
            circleY--;
        }
        repaint();
    }
    public static void main(String[] args){
        new BallGame();

    }
    
}
