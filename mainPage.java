import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class mainPage {
	JLabel l1,l2,l3,bgimage;
	ImageIcon pic;
	public mainPage() {
		
	
	JFrame f=new JFrame("blood world");
	JPanel p=new JPanel();
	l1=new JLabel("Donor");
	l1.setForeground(Color.red);
	l2=new JLabel("Camp");
	l2.setForeground(Color.red);
	//l3= new JLabel("BloodBank");
	l1.setBounds(50,100,200,70);
	l1.setFont(new Font("",Font.BOLD,24));
	l2.setBounds(50,170,200,70);
	l2.setFont(new Font("",Font.BOLD,24));
	//l3.setBounds(50,200,100,50);
	p.add(l1);
    p.add(l2);
	//p.add(l3);
	l1.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			new donorPage();
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
			new camp();
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
	
	
	/*l3.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			new bloodBank();
			setVisible(false);
			


		}

		private void setVisible(boolean b) {
			f.setVisible(b);

			

			
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
		
	});*/
	
	pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
	bgimage=new JLabel("",pic,JLabel.CENTER);
	bgimage.setBounds(0,0,700,500);
	p.add(bgimage);
	
    f.add(p);
    f.setLayout(null);
    p.setLayout(null);
    p.setSize(700,500);
	f.setSize(700,500);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {

new mainPage();

/*BackgroundImage pic=new BackgroundImage();*/
	}
}
