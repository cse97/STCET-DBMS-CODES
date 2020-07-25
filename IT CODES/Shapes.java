import java.applet.Applet;
import java.awt.*;

/*
<applet code="Shapes" width=200 height=300>
</applet>
*/

public class Shapes extends Applet
{
    public void paint(Graphics g)
    {
        Font font = new Font("Courier",Font.BOLD,15);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Different Shapes", 20, 20);

        g.drawLine(20,40,20,260);
        g.drawRect(30,40,40,40);
        g.fillRect(100,40,40,40);
        g.drawOval(30,100,40,40);
	g.fillOval(100,100,40,40);
        g.drawArc(30,160,40,40,30,270);
        g.fillArc(100,160,40,40,30,230);
	g.drawRoundRect(30,220,40,40,15,15);    
      	g.fillRoundRect(100,220,40,40,15,15);    


    }

}