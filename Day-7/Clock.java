import java.applet.*;
import java.awt.*;
import java.util.Date;

public class Clock extends Applet implements Runnable{
Thread t; 
	public void init(){
		t=new Thread(this);t.start();
		//setBackground(Color.red);
		//setForeground(Color.blue);
	}

	public void run(){
	for(;;){
	repaint();
		try{t.sleep(1000);}catch(InterruptedException e){}
		

	  }
	}
	
public void paint(Graphics g){

	
	g.drawString(new Date().toString(),100,100);
	}
}
//<applet code="Clock" width=600 height=400></applet>
