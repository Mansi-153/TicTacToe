import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TicTacToe implements ActionListener
{
	JFrame fr;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12;
	JPanel pa1,pa2;
	JLabel l1,l2;
	JTextField t1,t2;
	GridLayout g1;
	Font f;
	int c=0,a=0,b=0,d=0;
	
	public TicTacToe()
	{
		fr = new JFrame("TIC TAC TOE");
		pa1 = new JPanel();
		f = new Font("Calibri",Font.BOLD,72);
		pa2 = new JPanel();
		fr.setSize(800,400);

		l1 = new JLabel("PLAYER X");
		l2 = new JLabel("PLAYER O");
		t1 = new JTextField();
		t2 = new JTextField();

		b0 = new JButton("PLAY AGAIN");
		b11 = new JButton("PLA X Score "+a);
		b12 = new JButton("PLA O Score "+b);
		b0.setBounds(500,200,150,40);
		b11.setBounds(500,250,150,40);
		b12.setBounds(500,300,150,40);
		
		l1.setBounds(500,100,100,40);
		l2.setBounds(500,150,100,40);
		t1.setBounds(600,100,100,40);
		t2.setBounds(600,150,100,40);


		fr.getContentPane().add(pa1);
		fr.getContentPane().add(pa2);

		pa1.setBounds(0,0,400,400);
		pa2.setBounds(400,0,400,400);

		g1 = new GridLayout(3,3);
		pa1.setLayout(g1);
		pa2.setLayout(null);

		b2 = new JButton();
		b1 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();

		b1.setText("");b2.setText(" ");b3.setText("  ");b4.setText("   ");b5.setText("    ");
		b6.setText("     ");b7.setText("      ");b8.setText("       ");b9.setText("        ");

		b1.setFont(f);b2.setFont(f);b3.setFont(f);b4.setFont(f);b5.setFont(f);
		b6.setFont(f);b7.setFont(f);b8.setFont(f);b9.setFont(f);

		pa1.add(b1);pa1.add(b2);pa1.add(b3);pa1.add(b4);pa1.add(b5);
		pa1.add(b6);pa1.add(b7);pa1.add(b8);pa1.add(b9);pa2.add(t1);pa2.add(t2);
		
		pa2.add(l1);pa2.add(l2);pa2.add(b11);pa2.add(b0);pa2.add(b12);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt)
	{
		c++;
		if(evt.getSource()==b1)
		{
			if(c%2==0)
			b1.setText("O");
			else
			b1.setText("X");
			b1.setEnabled(false);
		}

		if(evt.getSource()==b2)
		{
			if(c%2==0)
			b2.setText("O");
			else
			b2.setText("X");
			b2.setEnabled(false);
		}
		if(evt.getSource()==b3)
		{
			if(c%2==0)
			b3.setText("O");
			else
			b3.setText("X");
			b3.setEnabled(false);
		}

		if(evt.getSource()==b4)
		{
			if(c%2==0)
			b4.setText("O");
			else
			b4.setText("X");
			b4.setEnabled(false);
		}

		if(evt.getSource()==b5)
		{
			if(c%2==0)
			b5.setText("O");
			else
			b5.setText("X");
			b5.setEnabled(false);
		}

		if(evt.getSource()==b6)
		{
			if(c%2==0)
			b6.setText("O");
			else
			b6.setText("X");
			b6.setEnabled(false);
		}
		if(evt.getSource()==b7)
		{
			if(c%2==0)
			b7.setText("O");
			else
			b7.setText("X");
			b7.setEnabled(false);
		}

		if(evt.getSource()==b8)
		{
			if(c%2==0)
			b8.setText("O");
			else
			b8.setText("X");
			b8.setEnabled(false);
		}

		if(evt.getSource()==b9)
		{
			if(c%2==0)
			b9.setText("O");
			else
			b9.setText("X");
			b9.setEnabled(false);
		}
		
		if((b1.getText()==b2.getText() && b2.getText()==b3.getText()) || (b7.getText()==b8.getText() && b8.getText()==b9.getText()) || (b4.getText()==b5.getText() && b5.getText()==b6.getText()) || (b1.getText()==b4.getText() && b4.getText()==b7.getText()) || (b2.getText()==b5.getText() && b5.getText()==b8.getText()) || (b9.getText()==b6.getText() && b6.getText()==b3.getText()) || (b7.getText()==b5.getText() && b5.getText()==b3.getText()) || (b1.getText()==b5.getText() && b5.getText()==b9.getText()) )
		{
			if(evt.getSource()!=b0)
			{
				if(c%2==0)
				{
					JOptionPane.showMessageDialog(fr,t2.getText()+" WON","CONGRATULATION",2);
					b++;
					b11.setText("PLA1 Score "+a);
					b12.setText("PLA2 Score "+b);

				}
				else
				{
					JOptionPane.showMessageDialog(fr,t1.getText()+" WON","CONGRATULATION",2);
					a++;
					b11.setText("PLA1 Score "+a);
					b12.setText("PLA2 Score "+b);

				}
			}
			
		}
		else
		{
			if(evt.getSource()!=b0 && b1.getText()!="" && b2.getText()!=" " && b3.getText()!="  " && b4.getText()!="   " && b5.getText()!="    " && b6.getText()!="     " && b7.getText()!="      " && b8.getText()!="       " && b9.getText()!="        ")
			JOptionPane.showMessageDialog(fr,"ITS A TIE","TRY AGAIN",0);
		}
		if(evt.getSource()==b0)
		{
			b9.setEnabled(true);b8.setEnabled(true);b7.setEnabled(true);b6.setEnabled(true);b5.setEnabled(true);
			b4.setEnabled(true);b3.setEnabled(true);b2.setEnabled(true);b1.setEnabled(true);
			b1.setText("");b2.setText(" ");b3.setText("  ");b4.setText("   ");b5.setText("    ");
			b6.setText("     ");b7.setText("      ");b8.setText("       ");b9.setText("        ");
			d++;
			if(d%2==0)
			{
				JOptionPane.showMessageDialog(fr,t1.getText()+" turn","INFORMATION",1);
				c=0;
			}
			else
			{
				JOptionPane.showMessageDialog(fr,t2.getText()+" turn","INFORMATION",1);
				c=1;
			}
			
		}
		

	}



	public static void main(String aa[])
	{
		new TicTacToe();
	}
}
	
	