import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Main1 extends Applet implements Runnable, ActionListener{
Thread t; String st="ABCDEGHIJKL", s1=""; TextField tf; Button bu;
	public void init(){
		t=new Thread(this);t.start();
		setBackground(Color.red);
		setForeground(Color.blue);
		tf=new TextField(20);
		bu=new Button("Press");
		add(tf);add(bu);
		bu.addActionListener(this);
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
	g.drawString(s1,100,200);
	}


	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==bu){
	s1=tf.getText();
	repaint();
	}
	}
}
//<applet code="Main1" width=600 height=400></applet>
