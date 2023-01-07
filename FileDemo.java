import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class filedemo extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1;
	JButton b1,b2;
	JTextArea t1;
	JTextField t2;
	JFileChooser jc;
	
	
	public filedemo()
	{
		f=new JFrame();
		l1=new JLabel("File name");
		b1=new JButton("Browse");
		b2=new JButton("View");
		t1=new JTextArea(20,50);
		t2=new JTextField(10);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(t1);
		
		f.setSize(100,100);
		f.show();
		f.pack();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) throws Exception
	{
		new filedemo();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			jc=new JFileChooser();
			jc.showOpenDialog(f);
			
		}
		if(ae.getSource()==b2)
		{
			try
			{
	
				int d;
				File f1 = new File(jc.getSelectedFile().getParent(),jc.getSelectedFile().getName());
				FileInputStream fin=new FileInputStream(f1);
				t2.setText(f1.getName());
				t1.setText("");
				while((d=fin.read())!= -1)
				{	
					t1.append("" + (char)d);
						
				};
			}
			catch(Exception e)
			{
				System.out.print("Exception is : " + e);
			}
		}
	}
}
