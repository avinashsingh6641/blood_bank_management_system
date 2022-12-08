import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.prefs.Preferences;
public class donorPage {
	JLabel l1,l2,l3,bgimage;
	JFrame f1,f3;
	JPanel p,p1;
	ImageIcon pic;
	public donorPage() {
		
	
    f3=new JFrame("blood world");
	p=new JPanel();
	p.setBackground(Color.white);
	l1=new JLabel("Registration");
	l2=new JLabel("Login");


	l1.setBounds(50,100,200,50);
	l2.setBounds(50,150,200,100);
	l1.setFont(new Font("",Font.BOLD,20));
	l2.setFont(new Font("",Font.BOLD,20));


	p.add(l1);
	p.add(l2);
	

	l3=new JLabel();
	l3.setIcon(new ImageIcon("D:\\mini project\\images\\backimage.png"));
	l3.setBounds(0,0,70,30);
	p.add(l3);
	
	l3.addMouseListener(new MouseListener() {




		@Override
		public void mouseClicked(MouseEvent arg0) {
			new mainPage();
			setVisible(false);


			
		}

		private void setVisible(boolean b) {
			f3.setVisible(b);


			
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
			new registrationPage();
			setVisible(false);
			
			


			
		}

		private void setVisible(boolean b) {
			f3.setVisible(b);


			
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
    p1=new JPanel();
	p1.setBackground(Color.white);
	JLabel l4=new JLabel("username");
	JLabel l5=new JLabel("password");
	JTextField tf1=new JTextField();
	JPasswordField tf2=new JPasswordField();
	l4.setBounds(20,30,100,30);
	l5.setBounds(20,70,100,30);
	tf1.setBounds(90,30,120,30);
	tf2.setBounds(90,70,120,30);
	
	p1.add(l4);
	p1.add(l5);
	p1.add(tf1);
	p1.add(tf2);
	
	JButton b=new JButton("Login");
	b.setBounds(60,120,100,30);
	p1.add(b);
	b.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String username=tf1.getText();
			String password=tf2.getText();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
				String sql="SELECT PASSWORD FROM DONORREGISTRATION WHERE USERNAME='"+username+"' ";
				String sql1="SELECT USERID FROM DONORREGISTRATION WHERE USERNAME='"+username+"'AND PASSWORD='"+password+"'";
				PreparedStatement ps= con.prepareStatement(sql);
				PreparedStatement ps1= con.prepareStatement(sql1);
				ResultSet rs1=ps1.executeQuery();
				while(rs1.next()) {
				String pre=rs1.getString("USERID");
				
				Preferences preferences=Preferences.userRoot();
				preferences.put("first", pre);
				}
				//ps.setString(1, username);
				//ps.setString(2, password);
				//int row=ps.executeUpdate();
				//if( row>1)
				//System.out.println("data updated successfully");
				
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					String pass=rs.getString("PASSWORD");
					if(pass.equals(password)) {
						JOptionPane.showMessageDialog(null, "login sucessful");
						new donorPage1();
						setVisible(false);
						setVisible(false);
					}
					else
						JOptionPane.showMessageDialog(null,"incorrect user id and password");
				}
			/*	if(username.equals(rs.getString("username"))&&password.equals(rs.getString("password"))) {
					JOptionPane.showMessageDialog(null, "login sucessful");
				}
					else {
						JOptionPane.showMessageDialog(null,"incorrect user id and password");
				
					}*/
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			

			
		}

		private void setVisible(boolean b) {
			f1.setVisible(b);
			f3.setVisible(b);
			
		}
		
	});
	
	f1.add(p1);
    f1.setLayout(null);
    p1.setLayout(null);
    p1.setSize(300,200);
	f1.setSize(300,200);
	f1.setVisible(true);


	f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	f1.setVisible(false);
	
	

	pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
	bgimage=new JLabel("",pic,JLabel.CENTER);
	bgimage.setBounds(0,0,700,500);
	p.add(bgimage);



	  f3.add(p);
	    f3.setLayout(null);
	    p.setLayout(null);
	    p.setSize(700,500);
		f3.setSize(700,500);
		p.setVisible(true);
		f3.setVisible(true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//String msg= registrationPage.getText(String msg);

		}
	
		public static void main(String[] args) {
		

	new donorPage();

		}

	}
