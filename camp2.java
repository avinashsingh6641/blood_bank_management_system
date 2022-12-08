import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class camp2 {
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
	JLabel bgimage;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	ImageIcon pic;
	Connection con;
	public camp2 (){
		JFrame f5=new JFrame();
		JPanel p=new JPanel();
		
		l1=new JLabel("Date");
		l2=new JLabel("Total amount of blood received");
		l3=new JLabel("A+");
		l4=new JLabel("B+");
		l5=new JLabel("AB+");
		l6=new JLabel("O+");
		l7=new JLabel("A-");
		l8=new JLabel("B-");
		l9=new JLabel("AB-");
		l10=new JLabel("O-");
		
		l1.setBounds(50,40,100,30);
		l2.setBounds(50,80,230,30);
		l3.setBounds(50,140,40,30);
		l4.setBounds(180,140,40,30);
		l5.setBounds(310,140,40,30);
		l6.setBounds(440,140,40,30);
		l7.setBounds(50,200,40,30);
		l8.setBounds(180,200,40,30);
		l9.setBounds(310,200,40,30);
		l10.setBounds(440,200,40,30);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		p.add(l7);
		p.add(l8);
		p.add(l9);
		p.add(l10);
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		tf10=new JTextField();
		

		tf1.setBounds(90,40,100,30);
		tf2.setBounds(240,80,40,30);
		tf3.setBounds(70,140,40,30);
		tf4.setBounds(200,140,40,30);
		tf5.setBounds(335,140,40,30);
		tf6.setBounds(460,140,40,30);
		tf7.setBounds(70,200,40,30);
		tf8.setBounds(200,200,40,30);
		tf9.setBounds(335,200,40,30);
		tf10.setBounds(460,200,40,30);
		
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(tf4);
		p.add(tf5);
		p.add(tf6);
		p.add(tf7);
		p.add(tf8);
		p.add(tf9);
		p.add(tf10);
		
		JButton b=new JButton("back");
		b.setBounds(300,350,80,30);
		p.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new camp1();
                 setVisible(false);


				
			}

			private void setVisible(boolean b) {
				f5.setVisible(b);

				
			}
			
		});
		JButton b1=new JButton("Fetch");
		b1.setBounds(200,40,70,30);
		p.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String date=tf1.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
					String sql="SELECT BLOODGROUP,SUM(BLOODUNIT) FROM CAMPPAGE1 WHERE DATE='"+date+"'GROUP BY BLOODGROUP";
					PreparedStatement ps= con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery(sql);
					System.out.println(rs);
					while(rs.next()) {	
						String a=rs.getString(1);
						//System.out.println(a);
						//int a=rs.getInt(2);
						//System.out.println(i);
						if(a.equals("A+")) {
							int i2=rs.getInt(2);
							//System.out.println(i2);
							tf3.setText(String.valueOf(i2));
						
						}else if(a.equals("B+")) {
							String B=rs.getString(2);
							tf4.setText(B);
							
						}else if(a.equals("AB+")) {
							String C=rs.getString(2);
							tf5.setText(C);
							
						}else if(a.equals("O+")) {
							String D=rs.getString(2);
							tf6.setText(D);
							
						}else if(a.equals("A-")) {
							String A1=rs.getString(2);
							tf7.setText(A1);
							
						}else if(a.equals("B-")) {
							String B1=rs.getString(2);
							tf8.setText(B1);
							
						}else if(a.equals("AB-")) {
							String C1=rs.getString(2);
							tf9.setText(C1);
							
						}else if(a.equals("O-")) {
							String D1=rs.getString(2);
							tf10.setText(D1);
							
						}
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
					String sql= "SELECT SUM(BLOODUNIT) FROM BLOODWORLD.CAMPPAGE1 WHERE DATE='"+date+"'";
					PreparedStatement ps= con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery(sql);
					rs.next();
					String b=rs.getString(1);
					tf2.setText(b);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
		bgimage=new JLabel("",pic,JLabel.CENTER);
		bgimage.setBounds(0,0,700,500);
		p.add(bgimage);
		
		
		
		
		    f5.add(p);
		    f5.setLayout(null);
		    p.setBackground(Color.white);
		    p.setLayout(null);
		    p.setSize(700,500);
			f5.setSize(700,500);
			f5.setVisible(true);
			p.setVisible(true);
			f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
new camp2();


	}

}
