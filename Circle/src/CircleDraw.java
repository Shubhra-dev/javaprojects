import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIDemo extends JFrame{
	
		JLabel nameLab;
		JTextField jt;
		
		JButton bt;
		Circle myC;
		public GUIDemo() {
			this.setLayout(new FlowLayout());
			nameLab = new JLabel();
			jt = new JTextField(10);
			jt.setText("0");
			bt = new JButton("Count Up");
			bt.addActionListener(new ButtonHandler());
			
			this.add(nameLab);
			this.add(jt);
			this.add(bt);
			this.addMouseListener(new MouseHandler());
		}
	
	public static void main(String[]args) {
		GUIDemo gd = new GUIDemo();
		gd.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gd.setSize(1200,700);
		gd.setVisible(true);
	}
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int val = Integer.parseInt(jt.getText());
			val++;
			jt.setText(val+"");
			
		}
	}
	
	private class MouseHandler extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			myC = new Circle(e.getX(),e.getY(),10);
			repaint();
		}
	}
	public void paint(Graphics g) {
		if(myC != null) myC.drawCircle(g);
	}
	
	class Circle{
		int x,y,rad;

		public Circle(int x, int y, int rad) {
			super();
			this.x = x;
			this.y = y;
			this.rad = r
