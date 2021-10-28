import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculator  extends JFrame{
	
	JLabel nameLab;
	JTextField jt;
	JTextField jt2;
	JTextField jt3;
	JTextField jt4;
	JButton bt;
	public Calculator() {
		this.setLayout(new FlowLayout());
		nameLab = new JLabel();
		jt = new JTextField(10);
		jt.setText("0");
		jt2 = new JTextField(10);
		jt3 = new JTextField(10);
		jt4 = new JTextField(10);
		bt = new JButton("Calculate");
		bt.addActionListener(new ButtonHandler());
		
		this.add(nameLab);
		this.add(jt);
		this.add(jt2);
		this.add(jt3);
		this.add(jt4);
		this.add(bt);
		
	}

public static void main(String[]args) {
	Calculator c = new Calculator();
	c.setDefaultCloseOperation(EXIT_ON_CLOSE);
	c.setSize(1200,700);
	c.setVisible(true);
}
private class ButtonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(jt.getText());
		int y = Integer.parseInt(jt3.getText());
		if(jt2.getText().equals("+")) {
			int val = x + y;
		    jt4.setText(val+ "");
		}
		else if(jt2.getText().equals("-")) {
			int val = x - y;
		    jt4.setText(val+ "");
		}
		else if(jt2.getText().equals("*")) {
			int val = x * y;
		    jt4.setText(val+ "");
		}
		else if(jt2.getText().equals("/")) {
			int val = x / y;
		    jt4.setText(val+ "");
		}
	}
}
}
