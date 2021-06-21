import java.awt.*;
import java.awt.event.*;
class First extends Frame{
First()
{
//setSize(500,500);
setBounds(10, 10, 700, 600);
setTitle("this is my first awt expeiment");
setLayout (new FlowLayout());
setVisible(true);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent windowEvent){
System.exit(0);
}
});

}
 public void paint(Graphics g)
    {
    	//background 
    	g.setColor(Color.black);
    	g.fillRect(1, 1, 692, 592);
}
public static void main(String args[])
{
First f = new First();
}
}
