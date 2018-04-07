import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends Applet implements ActionListener
{
	TextField t1,t2,t3.t4;
	Button b1,b2,b3,b4,b5;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("=");
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String s1,s2;
		int x=0,y=0;
		s1=t1.getText();
		x=Integer.parseInt(s1);
	    y=x;
	    

        if(e.getSource()==b1)
	    {
	    	y=y+x;
	    	t1.setText("0");
	    }
	    if(e.getSource()==b2)
	    {
	    	y=y-x;
	    	t1.setText("0");
	    }
	    if(e.getSource()==b3)
	    {
	    	y=y*x;
	    	t1.setText("0");
	    }
	    if(e.getSource()==b4)
	    {
	    	y=y/x;
	    	t1.setText("0");
	    }
	    s2=String.valueOf(y);
	    if(e.getSource()==b5)
	    {
	    	t1.setText(s2);
	    }
	}
}
/*
<applet code=calculator.java width=500 height=400>
</applet>
*/