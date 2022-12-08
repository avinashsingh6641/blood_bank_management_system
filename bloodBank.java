import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class bloodBank {
	JLabel l1,l2,l3;
	public bloodBank() {
		
	
	JFrame f=new JFrame("blood world");
	JPanel p=new JPanel();
	l1=new JLabel("registration");
	l2=new JLabel("login");


	l1.setBounds(50,100,100,50);
	l2.setBounds(50,150,50,50);


	p.add(l1);
	p.add(l2);
	
	
	l3=new JLabel();
	l3.setIcon(new ImageIcon("D:\\mini project\\bin\\backimage2.png"));
	l3.setBounds(0,0,70,30);
	p.add(l3);
	
	l3.addMouseListener(new MouseListener() {




		@Override
		public void mouseClicked(MouseEvent arg0) {
			new mainPage();
			this.setVisible(false);


			
		}

		private void setVisible(boolean b) {
			f.setVisible(false);


			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	
	l2.addMouseListener(new MouseListener() {




		@Override
		public void mouseClicked(MouseEvent arg0) {
			




			
		}


		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	
	
	
	l1.addMouseListener(new MouseListener() {



		public void mouseClicked(MouseEvent arg0) {
			new registrationPage();
			this.setVisible(false);
			
			


			
		}

		private void setVisible(boolean b) {
			f.setVisible(false);


			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});


	


	  f.add(p);
	    f.setLayout(null);
	    p.setLayout(null);
	    p.setSize(700,500);
		f.setSize(700,500);
		f.setVisible(true);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public static void main(String[] args) {

	new bloodBank();

		}

	}

