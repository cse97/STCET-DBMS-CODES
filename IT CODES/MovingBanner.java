import java.awt.*;
import java.applet.*;

public class MovingBanner extends Applet implements Runnable {
   String str = "This is a simple Banner ";
   Thread t ;
   boolean b;
   
   public void init() {
      setBackground(Color.white);
      setForeground(Color.yellow);
   }
   public void start() {
      t = new Thread(this);
      b = false;
      t.start();
   }
   public void run () {
      char ch;
      for( ; ; ) {
      try {
         repaint();
         Thread.sleep(250);
         ch = str.charAt(0);
         str = str.substring(1, str.length());
         str = str + ch;
      }
      catch(InterruptedException e) {}
      }
   }
   public void paint(Graphics g) {
      g.drawRect(1,1,300,150);
      g.setColor(Color.yellow);
      g.fillRect(1,1,300,150);
      g.setColor(Color.red);
      Font font = new Font("Courier",Font.BOLD,20);
      g.setFont(font);
      g.drawString(str, 10, 70);
   }
}

/*
<applet code="MovingBanner" width=500 height=500>
</applet>
*/