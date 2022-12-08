import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.*;
public class camp1 {
	JLabel l1,l2,l3,l4,l5,l6,logout,bgimage;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JFrame f,f6;
	ImageIcon pic;
	Connection con;
	String userid;
	public camp1() {
		f6=new JFrame();
		JPanel p=new JPanel();
		
		l1=new JLabel("Date");
		l1.setBounds(500,70,70,30);
		l2=new JLabel("Registration ID");
		l2.setBounds(50,90,100,30);
		l3=new JLabel("Blood Group");
		l3.setBounds(50,140,100,30);
		l4=new JLabel("blood Unit");
		l4.setBounds(50,190,100,30);
		l5=new JLabel("Remark");
		l5.setBounds(50,240,100,30);
		l6=new JLabel("Blood Data");
		l6.setBounds(50,290,100,30);
		l6.setForeground(Color.red);
		l6.addMouseListener(new MouseListener() {



			public void mouseClicked(MouseEvent arg0) {
				new camp2();
				this.setVisible(false);


				
			}

			private void setVisible(boolean b) {
				f6.setVisible(false);


				
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
				
			}});
		logout=new JLabel(new ImageIcon("D:\\mini project\\images\\logout.png"));
		logout.setText("Logout");
		logout.setBounds(600,0,80,50);
		logout.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				new camp();
				f6.setVisible(false);
				
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
		
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		p.add(logout);
		
		tf1=new JTextField();
		tf1.setBounds(550,70,80,30);
		tf2=new JTextField();
		tf2.setBounds(150,90,100,30);
		tf3=new JTextField();
		tf3.setBounds(150,140,100,30);
		tf4=new JTextField();
		tf4.setBounds(150,190,100,30);
		tf5=new JTextField();
		tf5.setBounds(150,240,100,30);
		
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(tf4);
		p.add(tf5);
		
		JButton b=new JButton("Enter");
		b.setBounds(90,360,80,30);
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String registrationid=tf2.getText();
				String bloodgroup=tf3.getText();
				int bloodunit=Integer.parseInt(tf4.getText());
				String remark=tf5.getText();
				String date=tf1.getText();

				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
					String sql1="SELECT REGID FROM REGDETAIL";
					PreparedStatement ps1= con.prepareStatement(sql1);
					ResultSet rs=ps1.executeQuery();
					while(rs.next()) {
						 userid=rs.getString("REGID");
					}
						if(userid.equals(registrationid)) {
					
					String sql="INSERT INTO CAMPPAGE1(registrationid,bloodgroup,bloodunit,remark,date)VALUES(?,?,?,?,?)";

					PreparedStatement ps= con.prepareStatement(sql);
					ps.setString(1,registrationid);
					ps.setString(2,bloodgroup);
					ps.setInt(3,bloodunit);
					ps.setString(4,remark);
					ps.setString(5,date);
					int row=ps.executeUpdate();
						}
						else 
							JOptionPane.showMessageDialog(null, "not registered");
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			
				
			}
			
		});
		p.add(b);
		
		pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
		bgimage=new JLabel("",pic,JLabel.CENTER);
		bgimage.setBounds(0,0,700,500);
		p.add(bgimage);

	    f6.add(p);
	    f6.setLayout(null);
	    p.setBackground(Color.white);
	    p.setLayout(null);
	    p.setSize(700,500);
		f6.setSize(700,500);
		f6.setVisible(true);
		p.setVisible(true);
		f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*f=new JFrame();
		JProgressBar pb=new JProgressBar(0,3);
		int i=0;
		Timer t=new Timer(1000,);
		f.addMouseListener(new MouseListener() {

			
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
		    f.setLayout(null);
			f.setSize(300,200);
			f.setVisible(true);
			p.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
			
			
		
	}

	public static void main(String[] args) {
            new camp1();

	}

}

