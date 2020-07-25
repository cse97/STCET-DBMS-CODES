/*
<applet code = "SongApplet.class" width ="220" height = "160" >
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.AudioClip;
public class SongApplet extends Applet implements ActionListener
{
	Button a;
	AudioClip Anthem;
	int flag=1;
	public void init()
	{
		setLayout(null);
		a=new Button("National Anthem");
		a.setBounds(40,40,140,60);
		a.addActionListener(this);
		add(a);

		Anthem=getAudioClip(getCodeBase(),"NationalAnthem.au");
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(flag==1)
		{
			Anthem.play();
			flag=0;
		}
		else
		{
			Anthem.stop();
			flag=1;
		}
	}
}
