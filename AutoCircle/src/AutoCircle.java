import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AutoCircle extends JFrame{
	
		JLabel nameLab;
		static Circle myC;
		public AutoCircle() {
			this.setLayout(new FlowLayout());
			nameLab = new JLabel();
		}
	
	public static void main(String[]args) {
		AutoCircle cd = new AutoCircle();
		cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cd.setSize(1200,700);
		cd.setVisible(true);
		int x = 0;
		int y = 0;
	}
	
	public void paint(Graphics g) {
		if(myC != null) myC.drawCircle(g);
	}
	
	class Circle implements ActionListener{
		int cord_x,cord_y,radious;

		public Circle(int cord_x, int cord_y, int radious) {
			super();
			this.cord_x = cord_x;
			this.cord_y = cord_y;
			this.radious = radious;
		}
		
		public void drawCircle(Graphics g) {
			g.fillOval(cord_x,cord_y,2*radious,2*radious);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Timer t = new Timer(20,this);
		}
	}

}
