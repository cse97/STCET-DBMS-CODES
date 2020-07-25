import java.awt.*;
import java.applet.*;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable { 
   Thread t,t1;
   public void start() {
      t = new Thread(this);
      t.start();
   }
   public void run() { 
      t1 = Thread.currentThread();
      while(t1 == t) {
         repaint();
         try {
            t1.sleep(1000);    
         }
         catch(InterruptedException e){}
      }
   }
   public void paint(Graphics g) {
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      g.setColor(Color.black);
      g.fillOval(50,25,100,100);
      Font font = new Font("Courier", Font.BOLD,15);
      g.setFont(font);
      g.setColor(Color.red);
      g.drawString(hour + ":" + minute + ":" + second, 65, 75);
   }
}

/*
<applet code="ClockApplet" width=300 height=300>
</applet>
*/
