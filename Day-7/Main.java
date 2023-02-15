import java.applet.*;
import java.awt.*;

public class Main extends Applet implements Runnable{
Thread t; String st="ABCDEGHIJKL";
	public void init(){
		t=new Thread(this);t.start();
		setBackground(Color.red);
		setForeground(Color.blue);
	}

	public void run(){
	for(;;){
	repaint();
		try{t.sleep(500);}catch(InterruptedException e){}
		char ch=st.charAt(0);
	st=st.substring(1,st.length());
	st=st+ch;

}
}
	public void paint(Graphics g){

	
	g.drawString(st,100,100);
	}
}
//<applet code="Main" width=600 height=400></applet>
