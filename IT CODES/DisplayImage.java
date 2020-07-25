import java.awt.*;  
import java.applet.*;  
/*
<applet code="DisplayImage" width="300" height="300">
</applet>
*/  
  
public class DisplayImage extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"Happy.png");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
     }
