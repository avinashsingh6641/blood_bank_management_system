import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class camp {
	JLabel l1,l2,l3,bgimage;
	JPanel p,p2;
	JFrame f1,f7;
	ImageIcon pic;
	public camp() {
		
	
	f7=new JFrame("blood world");
	JPanel p=new JPanel();
	p.setBackground(Color.white);
	l1=new JLabel("Registration");
	l2=new JLabel("Login");
	l1.setFont(new Font("",Font.BOLD,20));
	l2.setFont(new Font("",Font.BOLD,20));


	l1.setBounds(50,100,200,50);
	l2.setBounds(50,150,200,100);


	p.add(l1);
	p.add(l2);
	

	l3=new JLabel();
	l3.setIcon(new ImageIcon("D:\\mini project\\bin\\backimage2.png"));
	l3.setBounds(0,0,70,30);
	//l3.setVisible(true);
	p.add(l3);
	
	l3.addMouseListener(new MouseListener() {




		@Override
		public void mouseClicked(MouseEvent arg0) {
			new mainPage();
			setVisible(false);


			
		}

		private void setVisible(boolean b) {
			f7.setVisible(b);


			
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
			f1.setVisible(true);



			
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
			new campRegistrationPage();
			setVisible(false);
			
			


			
		}

		private void setVisible(boolean b) {
			f7.setVisible(b);


			
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
	
	

	f1=new JFrame();
    p2=new JPanel();
	p2.setBackground(Color.white);
	JLabel l4=new JLabel("username");
	JLabel l5=new JLabel("password");
	JTextField tf1=new JTextField();
	JPasswordField tf2=new JPasswordField();
	l4.setBounds(20,30,100,30);
	l5.setBounds(20,70,100,30);
	tf1.setBounds(90,30,120,30);
	tf2.setBounds(90,70,120,30);
	
	
	p2.add(l4);
	p2.add(l5);
	p2.add(tf1);
	p2.add(tf2);
	
	JButton b=new JButton("Login");
	b.setBounds(60,120,100,30);
	p2.add(b);
	b.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String user=tf1.getText();
			String pass=tf2.getText();
			if(pass.equals("Admin@1234") && user.equals("Admin")) {
			
			System.out.println(pass);
			System.out.println(user);
			
			
			new camp1();
			f1.setVisible(false);
			f7.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"incorrect user id and password");
			}
			
		}

		/*private void setVisible(boolean b) {
			f1.setVisible(b);
			f7.setVisible(b);
			
		}*/
		
	});
	
	
	pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
	bgimage=new JLabel("",pic,JLabel.CENTER);
	bgimage.setBounds(0,0,700,500);
	p.add(bgimage);
	
	
	
	f1.add(p2);
    f1.setLayout(null);
    p2.setLayout(null);
    p2.setSize(300,200);
	f1.setSize(300,200);
	f1.setVisible(true);


	f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	f1.setVisible(false);



	


	    f7.add(p);
	    f7.setLayout(null);
	    p.setLayout(null);
	    p.setSize(700,500);
		f7.setSize(700,500);
		f7.setVisible(true);
		p.setVisible(true);
		f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		public static void main(String[] args) {

	new camp();

		}

	}


