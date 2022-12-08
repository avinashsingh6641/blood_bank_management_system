import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.prefs.Preferences;
import com.toedter.calendar.JDateChooser;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Date;
import java.util.Locale;
public class registrationPage {
	int passwordConditionViolated=0;
	 boolean pass=true,bol;
	 String password;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,bgimage;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	private JComboBox cb1,cb2;
	String gender,bloodgroup,no,userid,first;
	ImageIcon pic;
	Connection con;
	
    int i;
	private static JFormattedTextField yearsTextField;
	protected static String username1;
	public registrationPage() {
		JFrame f8=new JFrame("registration page");
		JPanel p=new JPanel();
		
		l1=new JLabel("First name");
		l2=new JLabel("Last name");
		l3= new JLabel("city");
		l4=new JLabel("state");
		l5=new JLabel("pincode");
		l6 = new JLabel("Gender");
		l7=new JLabel("blood group");
		l8=new JLabel("user name");
		l9=new JLabel("password");
		l10=new JLabel("DOB");
		l11=new JLabel("password length should be greater than 8, password should contain digits and one special characters");
		l12=new JLabel("");
		l13=new JLabel("EMail");
		l14=new JLabel("phone number");
		
		l1.setBounds(50,50,100,50);
		l2.setBounds(300,50,100,50);
		l3.setBounds(300,90,100,50);
		l4.setBounds(50,130,100,50);
		l5.setBounds(300,130,100,50);
		l6.setBounds(50,170,100,50);
		l7.setBounds(300,170,100,50);
		l8.setBounds(50,210,100,50);
		l9.setBounds(300,210,100,50);
		l10.setBounds(50,90,100,50);
		l11.setBounds(30,250,600,30);
		l11.setForeground(Color.red);
		l12.setBounds(150,350,300,30);
		l12.setForeground(Color.red);
		l13.setBounds(50,280,100,50);
		l14.setBounds(300,280,100,50);
		
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
		p.add(l11);
		p.add(l12);
		p.add(l13);
		p.add(l14);
		
		tf1=new JTextField();
		//tf2=new JTextField();
		JDateChooser dc=new JDateChooser();
		dc.setLocale(Locale.US);
		//String date=new SimpleDateFormat("MM/dd/Y") ;
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		cb1=new JComboBox(new String []{"Male","Female","others"});
		cb1.addMouseListener(new MouseListener() {

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
		cb2=new JComboBox(new String []{"+A","+B","+AB","+O","-A","-B","-AB","-O"});
		cb2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
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
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		tf9=new JTextField();
		tf10=new JTextField();
		tf11=new JTextField();
		
		tf1.setBounds(150,60,100,30);
		dc.setBounds(150,100,100,30);
		tf3.setBounds(400,100,100,30);
		tf4.setBounds(150,140,100,30);
		tf5.setBounds(400,140,100,30);
		tf6.setBounds(400,60,100,30);
		cb1.setBounds(150,180,100,30);
		cb2.setBounds(400,180,100,30);
		tf8.setBounds(150,220,100,30);
		tf9.setBounds(400,220,100,30);
		tf10.setBounds(150,290,100,30);
		tf11.setBounds(400,290,100,30);
		
		p.add(tf1);
		//p.add(tf2);
		p.add(tf3);
		p.add(tf4);
		p.add(tf5);
		p.add(cb1);
		p.add(cb2);
		p.add(tf8);
		p.add(tf9);
		p.add(tf6);
		p.add(tf10);
		p.add(tf11);
		p.add(dc);
		
		JButton b=new JButton("back");
		b.setBounds(10,20,70,30);
		p.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new donorPage();
				this.setVisible(false);


				
			}

			private void setVisible(boolean b) {
				f8.setVisible(false);


				
			}
			
		});
		
		
		JButton b1= new JButton("submit");
		b1.setBounds(250,400,100,30);
		p.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new PasswordValidator();
				
				String firstname=tf1.getText();
				String lastname=tf6.getText();
				//String date = date.format(this.dc.getDate());
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				String DOB=sdf.format(dc.getDate());
				//sdf.parse(date);
				//java.sql.Date DOB=dc.getDateEditor().getUiComponent().getText();
				String city=tf3.getText();
				String state=tf4.getText();
				int pincode=Integer.parseInt(tf5.getText());
				gender=cb1.getSelectedItem().toString();
				bloodgroup=cb2.getSelectedItem().toString();
				String email=tf10.getText();
				Double phoneno=Double.parseDouble(tf11.getText());
				String username=tf8.getText();
				String password=tf9.getText();
				
				 
				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
						String sql1="SELECT NO FROM NUMBER WHERE ID=1";
						PreparedStatement ps= con.prepareStatement(sql1);
						ResultSet rs=ps.executeQuery(sql1);
						if(rs.next()) {
						no=rs.getString("NO");
						}
						
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
				 userid="MSAS"+ new SimpleDateFormat("ddMMyy").format(new Date())+no;
				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");						
						String sql="INSERT INTO DONORREGISTRATION(userid,firstname,lastname,DOB,city,state,pincode,gender,bloodGroup,email,phoneNo,username,password) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
						
						
						
						PreparedStatement ps= con.prepareStatement(sql);
						ps.setString(1, userid);
						ps.setString(2,firstname);
						ps.setString(3,lastname);
						ps.setString(4,DOB);
						ps.setString(5,city);
						ps.setString(6,state);
						ps.setInt(7,pincode);
						ps.setString(8,gender);
						ps.setString(9,bloodgroup);
						ps.setString(10,email);
						ps.setDouble(11,phoneno);
						ps.setString(12,username);
						ps.setString(13,password);
						int row=ps.executeUpdate();
						
					
						
						//Class.forName("com.mysql.cj.jdbc.Driver");
						//con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
						//String sql3="SELECT FIRSTNAME,LASTNAME FROM DONORREGISTRATION WHERE USERID='"+userid+"'";
						//PreparedStatement ps2= con.prepareStatement(sql3);
						//ResultSet rs=ps.executeQuery(sql3);
						//System.out.println(rs);
						//while(rs.next()) {
						// first=rs.getString("FIRSTNAME");
						//String last=rs.getString("LASTNAME");
						//System.out.println(first);
						//System.out.println(last);
						//}
					//String msg= first;
					//new donorPage1(msg);
					
						
						
						//if( row>1)
						//System.out.println("data updated successfully");
						
						//ResultSet rs=ps.executeQuery();
						
							//else
								//JOptionPane.showMessageDialog(null,"incorrect user id and password");
						
						
					}catch(Exception e) {
						e.printStackTrace();
					}
				

				 try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
						String sql2= "UPDATE NUMBER	SET NO=NO+1";
						PreparedStatement ps= con.prepareStatement(sql2);
						int row1=ps.executeUpdate(sql2);
				 }catch(Exception e) {
					 e.printStackTrace();
				 }
				 
				/* try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
						String sql3="SELECT FIRSTNAME,LASTNAME FROM DONORREGISTRATION WHERE USERID='"+userid+"'";
						PreparedStatement ps= con.prepareStatement(sql3);
						ResultSet rs=ps.executeQuery(sql3);
						while(rs.next()) {
						String username1=rs.getString("FIRSTNAME,LASTNAME");
						}
					String msg= username1;
					new donorPage1(msg);
					
						
				 }catch(Exception e) {
					 e.printStackTrace();
				 } */
				
				
				
			}
			
		});
		/*pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
		bgimage=new JLabel("",pic,JLabel.CENTER);
		bgimage.setBounds(0,0,700,500);
		p.add(bgimage);*/
		
		
		 f8.add(p);
		    f8.setLayout(null);
		    p.setLayout(null);
		    p.setSize(700,500);
			f8.setSize(700,500);
			f8.setVisible(true);
			p.setVisible(true);
			f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
	public registrationPage(String msg) {
		
	}
	

	class InvalidPasswordException extends Exception{
		
		int passwordConditionViolated=0;
		
		public InvalidPasswordException(int conditionViolated) {
			passwordConditionViolated=conditionViolated;
		}
		
		public String printMessage() {
			switch(passwordConditionViolated) {
			case 1: return("Password Length should be 8 characters");
			case 2: return("Password should contain at least one digit(0-9)");
			case 3: return("Password should contain at least one special character");
			}
			return("");
		}
		
	}


	public class PasswordValidator {
		{

			String password=tf9.getText();
			try {
			isValid(password);
			l12.setText("Registration successful ");
			
			}
			catch(InvalidPasswordException e) {
				l12.setText(e.printMessage());
			
			}
			
		}

		private void isValid(String password) throws InvalidPasswordException {
			// TODO Auto-generated method stub
			
			if (password.length()<8) {
				throw new InvalidPasswordException(1);
			
			}
			if(true) {
				int count=0;
				//check digits from 0 to 9
				for (int i=0;i<=9;i++) {
					String str1=Integer.toString(i);
					if(password.contains(str1)) {
						count=1;
					}
				}
				if(count==0) {
					throw new InvalidPasswordException(2);
				}
			}
			Pattern specialCharPattern=Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
			
			if(!specialCharPattern.matcher(password).find()) {
				throw new InvalidPasswordException(3);
			}
			
		}
	}
		
		
		
			public static void main(String[] args) {

		new registrationPage();

			}

}
