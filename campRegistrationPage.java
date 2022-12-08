
import java.awt.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
public class campRegistrationPage {
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,usertf8,passtf9,emailtf10,tf11,tf12;
	private JComboBox cb1,cb2;
	JButton b2;
	JRadioButton rb1,rb2;
	JFileChooser fc;
	ImageIcon pic;
	JLabel bgimage;
	public campRegistrationPage() {
		JFrame f4=new JFrame("registration page");
		JPanel p=new JPanel();
		p.setBackground(Color.white);
		
		l1=new JLabel("First name");
		l2=new JLabel("Last name");
		l3= new JLabel("city");
		l4=new JLabel("state");
		l5=new JLabel("pincode");
		l6 = new JLabel("Gender");
		//l7=new JLabel("blood group");
		l8=new JLabel("user name");
		l9=new JLabel("password");
		l10=new JLabel("DOB");
		l11=new JLabel();
		l11.setIcon(new ImageIcon("D:\\mini project\\images\\password.png"));
		l12=new JLabel("");
		l13=new JLabel("EMail");
		//l14=new JLabel("phone number");
		l8.setVisible(false);
		l9.setVisible(false);
		l11.setVisible(false);
		
		l1.setBounds(50,50,100,50);
		l2.setBounds(300,50,100,50);
		l3.setBounds(300,90,100,50);
		l4.setBounds(50,130,100,50);
		l5.setBounds(300,130,100,50);
		l6.setBounds(50,170,100,50);
		//l7.setBounds(300,170,100,50);
		l8.setBounds(50,250,100,50);
		l9.setBounds(300,250,100,50);
		l10.setBounds(50,90,100,50);
		l11.setBounds(510,210,600,200);
		//l11.setForeground(Color.red);
		l12.setBounds(150,350,300,30);
		l12.setForeground(Color.red);
		l13.setBounds(300,170,100,50);
		//l14.setBounds(300,280,100,50);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(l6);
		//p.add(l7);
		p.add(l8);
		p.add(l9);
		p.add(l10);
		p.add(l11);
		p.add(l12);
		p.add(l13);
		//p.add(l14);
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		cb1=new JComboBox(new String []{"Male","Female","others"});
		//cb2=new JComboBox(new String []{"+A","+B","+AB","+O","-A","-B","-AB","-O"});
		tf7=new JTextField();
		usertf8=new JTextField();
		passtf9=new JTextField();
		emailtf10=new JTextField();
		tf11=new JTextField();
		usertf8.setVisible(false);
		passtf9.setVisible(false);
		
		tf1.setBounds(150,60,100,30);
		tf2.setBounds(400,60,100,30);
		tf3.setBounds(150,100,100,30);
		tf4.setBounds(400,100,100,30);
		tf5.setBounds(150,140,100,30);
		tf6.setBounds(400,140,100,30);
		cb1.setBounds(150,180,100,30);
		//cb2.setBounds();
		usertf8.setBounds(150,260,100,30);
		passtf9.setBounds(400,260,100,30);
		emailtf10.setBounds(400,180,100,30);
		//tf11.setBounds(400,290,100,30);
		
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(tf4);
		p.add(tf5);
		p.add(cb1);
		//p.add(cb2);
		p.add(usertf8);
		p.add(passtf9);
		p.add(tf6);
		p.add(emailtf10);
		//p.add(tf11);
		
		JButton b=new JButton("back");
		b.setBounds(10,20,70,30);
		p.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new camp();
				this.setVisible(false);


				
			}

			private void setVisible(boolean b) {
				f4.setVisible(false);


				
			}
			
		});
		
		JButton b1= new JButton("submit");
		b1.setBounds(250,410,100,30);
		p.add(b1);
		b1.addActionListener(new ActionListener() {
			
			



			public void actionPerformed(ActionEvent arg0) {
				new PasswordValidator();
				
				


				
			}
			
		});
		
		 rb1=new JRadioButton("Helper");
		    rb2=new JRadioButton("Blood Data Handler");
		   
		    rb1.setBounds(50,210,100,50);
		    p.add(rb1);
		    rb1.setBackground(Color.white);
		    rb2.setBounds(300,210,200,50);
		    p.add(rb2);
		    rb2.setBackground(Color.white);
		    ButtonGroup bg=new ButtonGroup();
		    bg.add(rb1);;
		    bg.add(rb2);
		    
		    rb2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					l8.setVisible(true);
					l9.setVisible(true);
					usertf8.setVisible(true);
					passtf9.setVisible(true);
					l11.setVisible(true);


					
				}
		    	
		    });
		    
		    rb1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					l8.setVisible(false);
					l9.setVisible(false);
					usertf8.setVisible(false);
					passtf9.setVisible(false);
					l11.setVisible(false);


					
				}
		    	
		    });
		    //file chooser
		     b2=new JButton("choose File");
		    tf12=new JTextField();
		    tf12.setBounds(180,310,250,30);
		    
		    b2.setBounds(50,310,100,30);
		    b2.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent arg0) {
					 fileChooser();
					 tf12.setText(fc.getSelectedFile().getAbsolutePath());
					
				}
		    	
		    });
		    p.add(b2);
		    p.add(tf12);
		    pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
			bgimage=new JLabel("",pic,JLabel.CENTER);
			bgimage.setBounds(0,0,700,500);
			p.add(bgimage);
		
		
		
		    f4.add(p);
		    f4.setLayout(null);
		    p.setLayout(null);
		    p.setSize(700,500);
			f4.setSize(700,500);
			f4.setVisible(true);
			f4.setVisible(true);
			f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

			String password=passtf9.getText();
			try {
			isValid(password);
			l12.setText("Registration successful ");
			}
			catch(InvalidPasswordException e) {
				l12.setText(e.printMessage());
			
			}
			
		}

		private  void isValid(String password) throws InvalidPasswordException {
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
	public void fileChooser() {
	
	fc=new JFileChooser();
    fc.setCurrentDirectory(new java.io.File(""));
    fc.setDialogTitle("choose file");
    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    if(fc.showOpenDialog(b2)==JFileChooser.APPROVE_OPTION) {
    	
    }
	}
	
   



			
			
	
			public static void main(String[] args) {

		new campRegistrationPage();

			}
}

