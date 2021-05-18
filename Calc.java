import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Frame1 extends JFrame
{
	double memstore;
	JTextField t = new JTextField();
	JButton b1 = new JButton("MC");							//DONE
	JButton b2 = new JButton("MR");							//DONE
	JButton b3 = new JButton("M+");							//DONE
	JButton b4 = new JButton("M-");							//DONE
	JButton b5 = new JButton("MS");							//DONE
	JButton b6 = new JButton("%");							//DONE
	JButton b7 = new JButton("CE");							//DONE
	JButton b8 = new JButton("C");							//DONE
	JButton b9 = new JButton("CLEAR");						//DONE
	JButton b10 = new JButton("1/x");						//DONE
	JButton sq = new JButton("x\u00B2");					//DONE
	JButton sqrt = new JButton("\u221A");					//DONE
	JButton b13 = new JButton("/");							//DONE
	JButton b14 = new JButton("7");							//DONE
	JButton b15 = new JButton("8");							//DONE
	JButton b16 = new JButton("9");							//DONE
	JButton b17 = new JButton("X");							//DONE
	JButton b18 = new JButton("4");							//DONE
	JButton b19 = new JButton("5");							//DONE
	JButton b20 = new JButton("6");							//DONE
	JButton sub = new JButton("-");							//DONE
	JButton b22 = new JButton("1");							//DONE
	JButton b23 = new JButton("2");							//DONE
	JButton b24 = new JButton("3");							//DONE
	JButton addi = new JButton("+");						//DONE
	JButton b26 = new JButton("+/-");						//DONE
	JButton b27 = new JButton("0");							//DONE
	JButton b28 = new JButton(".");							//DONE
	JButton equal = new JButton("=");						//DONE
	Frame1()
	{
		setTitle("Calculator");
		setResizable(false);
		setLayout(null);
		setSize(510,650);
		setDefaultCloseOperation(3);
		t.setHorizontalAlignment(4);
		t.setFont(new Font("Arial",1,50));

		t.setSize(500,150);
		t.setLocation(0,0);
		add(t);

		b1.setSize(100,50);
		b1.setLocation(0,150);
		add(b1);

		b2.setSize(100,50);
		b2.setLocation(100,150);
		add(b2);

		b3.setSize(100,50);
		b3.setLocation(200,150);
		add(b3);

		b4.setSize(100,50);
		b4.setLocation(300,150);
		add(b4);

		b5.setSize(100,50);
		b5.setLocation(400,150);
		add(b5);

		b6.setSize(125,65);
		b6.setLocation(0,200);
		add(b6);

		b7.setSize(125,65);
		b7.setLocation(125,200);
		add(b7);

		b8.setSize(125,65);
		b8.setLocation(250,200);
		add(b8);

		b9.setSize(125,65);
		b9.setLocation(375,200);
		add(b9);

		b10.setSize(125,65);
		b10.setLocation(0,265);
		add(b10);

		sq.setSize(125,65);
		sq.setLocation(125,265);
		add(sq);

		sqrt.setSize(125,65);
		sqrt.setLocation(250,265);
		add(sqrt);

		b13.setSize(125,65);
		b13.setLocation(375,265);
		add(b13);

		b14.setSize(125,65);
		b14.setLocation(0,330);
		add(b14);

		b15.setSize(125,65);
		b15.setLocation(125,330);
		add(b15);

		b16.setSize(125,65);
		b16.setLocation(250,330);
		add(b16);

		b17.setSize(125,65);
		b17.setLocation(375,330);
		add(b17);

		b18.setSize(125,65);
		b18.setLocation(0,395);
		add(b18);

		b19.setSize(125,65);
		b19.setLocation(125,395);
		add(b19);

		b20.setSize(125,65);
		b20.setLocation(250,395);
		add(b20);

		sub.setSize(125,65);
		sub.setLocation(375,395);
		add(sub);

		b22.setSize(125,65);
		b22.setLocation(0,460);
		add(b22);

		b23.setSize(125,65);
		b23.setLocation(125,460);
		add(b23);

		b24.setSize(125,65);
		b24.setLocation(250,460);
		add(b24);

		addi.setSize(125,65);
		addi.setLocation(375,460);
		add(addi);

		b26.setSize(125,65);
		b26.setLocation(0,525);
		add(b26);

		b27.setSize(125,65);
		b27.setLocation(125,525);
		add(b27);

		b28.setSize(125,65);
		b28.setLocation(250,525);
		add(b28);

		equal.setSize(125,65);
		equal.setLocation(375,525);
		add(equal);

		b14.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				digitClick(ee);
			}
		});
		b15.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				digitClick(ee);
			}
		});
		b16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				digitClick(ee);
			}
		});
		b17.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				digitClick(ee);
			}
		});
		b18.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				digitClick(ee);
			}
		});
		b19.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b20.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b22.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b23.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b24.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b27.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		sub.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b13.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		/*
		b6.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		*/
		addi.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b28.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ee)
					{
						digitClick(ee);
					}
		});
		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				String s=t.getText();
				int l=s.length();
				String s1=s.substring(0,l-1);
				t.setText(s1+"");
			}
		});
		sqrt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				sqrtClick(ee);
			}
		});
		sq.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				sqClick(ee);
			}
		});
		b10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				onebynoClick(ee);
			}
		});
		equal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				equClick(ee);
			}
		});
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				t.setText("");
			}
		});
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				t.setText("");
			}
		});
		b26.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				negateClick(ee);
			}
		});
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				memstClick(ee);
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				memaddClick(ee);
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				memsubClick(ee);
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				memreClick(ee);
			}
		});
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				memclear(ee);
			}
		});
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ee)
			{
				percClick(ee);
			}
		});
	}
	void digitClick(ActionEvent evt)
	{
		String s1=t.getText();
		String s2=evt.getActionCommand();
		t.setText(s1+s2);
	}
	void sqrtClick(ActionEvent evt)
	{
		String s1=t.getText();
		double n = Double.parseDouble(s1);
		double n1= Math.sqrt(n);
		t.setText(n1+"");
	}
	void sqClick(ActionEvent evt)
	{
		String s1=t.getText();
		double n = Double.parseDouble(s1);
		double n1= n*n;
		t.setText(n1+"");
	}
	void onebynoClick(ActionEvent ee)
	{
		String s1=t.getText();
		double n = Double.parseDouble(s1);
		double n1= 1/n;
		t.setText(n1+"");
	}
	void equClick(ActionEvent evt)
	{
		String s=t.getText();
		int p;
		p=s.indexOf("+");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double n1=Double.parseDouble(s1);
			double n2=Double.parseDouble(s2);
			double ans=n1+n2;
			t.setText(ans+"");
		}
		p=s.indexOf("-");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double n1=Double.parseDouble(s1);
			double n2=Double.parseDouble(s2);
			double ans=n1-n2;
			t.setText(ans+"");
		}
		p=s.indexOf("X");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double n1=Double.parseDouble(s1);
			double n2=Double.parseDouble(s2);
			double ans=n1*n2;
			t.setText(ans+"");
		}
		p=s.indexOf("/");
		if(p>0)
		{
			String s1=s.substring(0,p);
			String s2=s.substring(p+1);
			double n1=Double.parseDouble(s1);
			double n2=Double.parseDouble(s2);
			double ans=n1/n2;
			t.setText(ans+"");
		}
	}
	void negateClick(ActionEvent evt)
	{
		String s=t.getText();
		double n = Double.parseDouble(s);
		double n1= -(n);
		t.setText(n1+"");
	}
	void memstClick(ActionEvent evt)
	{
		String s = t.getText();
		double d1 = Double.parseDouble(s);
		memstore=d1;
		t.setText("");
	}
	void memaddClick(ActionEvent evt)
	{
		String s= t.getText();
		double d1 = Double.parseDouble(s);
		memstore=memstore+d1;
		t.setText("");
	}
	void memsubClick(ActionEvent evt)
	{
		String s= t.getText();
		double d1 = Double.parseDouble(s);
		memstore=memstore-d1;
		//t.setText("");
	}
	void memreClick(ActionEvent evt)
	{
		t.setText(memstore+"");
	}
	void memclear(ActionEvent evt)
	{
		t.setText("");
		memstore=0;
	}
	void percClick(ActionEvent evt)
	{
		String s= t.getText();
		//String ss=evt.getActionCommand();
		//t.setText(s+ss);
		int p=s.indexOf("X");
		String s1=s.substring(p+1);
		String s2=s.substring(0,p+1);
		double d1 = Double.parseDouble(s1);
		double d2 = d1/100;
		t.setText(s2+d2+"");
	}
}
public class Calc
{
	public static void main(String[] args)
	{
		Frame1 f = new Frame1();
		f.setVisible(true);
	}
}