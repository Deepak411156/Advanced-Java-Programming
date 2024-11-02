import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class Demo {

public Demo()
{

Frame frame = new Frame();

frame.setSize(400,400);

frame.setVisible(true);

frame.addWindowListener(new WindowAdapter(){

public void windowClosing(WindowEvent we)
{
System.exit(0);

}
});

}
   

public static void main(String[] args)

{
Demo demo = new Demo();

}
}
