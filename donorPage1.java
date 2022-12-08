import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.util.prefs.Preferences;
public class donorPage1 {
	
	JLabel logout,bgimage,l9,l10;
	ImageIcon pic;
	JFrame f1,f2;
	JTextField tf1,tf2;
	JComboBox cb1,cb2;
	Connection con;
	
	JList list;
	//String camp;
	 String camp1[];
	DefaultListModel m;
	JPanel p;
	public donorPage1(){
		 f2=new JFrame();
		 p=new JPanel();
		JLabel l1=new JLabel("blood donated");
		
		l1.setBounds(50,100,100,30);
		JLabel l2=new JLabel("times");
		l2.setBounds(160,100,50,30);
		JLabel l3=new JLabel("search for blood donation camp");
		l3.setBounds(50,150,300,30);
		JLabel l4=new JLabel("select states");
		l4.setBounds(50,180,150,30);
		JLabel l5=new JLabel("register");
		l5.setForeground(Color.red);
		l5.setBounds(50,310,100,30);
		l5.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				String state=cb1.getSelectedItem().toString();
				String district=cb2.getSelectedItem().toString();
				String campname=tf2.getText();
				String regid=l9.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
					String sql="INSERT INTO REGDETAIL(regid,state,district,campname)VALUES(?,?,?,?)";
					PreparedStatement ps= con.prepareStatement(sql);
					ps.setString(1,regid);
					ps.setString(2,state);
					ps.setString(3,district);
					ps.setString(4,campname);
					int row=ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "registretion successful");
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
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
		JLabel l6=new JLabel("select Districts");
		l6.setBounds(250,180,200,30);
		//JLabel l7=new JLabel("Donor Pass");
		//l7.setBounds(50,350,100,30);
		JLabel l8=new JLabel("/ currently only for Maharashtra");
		//JFrame f8=new JFrame();
		
		
		l8.setBounds(230,150,200,30);
		l8.setForeground(Color.red);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
			//String sql="SELECT FIRSTNAME,LASTNAME FROM DONORREGISTRATION "
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		Preferences preferences=Preferences.userRoot();
		String value= preferences.get("first"," not found");
		System.out.println(value);
		
		l9=new JLabel(value);
		l9.setBounds(50,50,150,30);
		//l9.setText(value);
		
		
	
		
		
		
		l10=new JLabel();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
			String Sql2="SELECT COUNT(REMARK) FROM CAMPPAGE1 WHERE REGISTRATIONID='"+value+"'AND REMARK LIKE'SUCC%'";
			PreparedStatement ps2= con.prepareStatement(Sql2);
			ResultSet rs=ps2.executeQuery();
			while(rs.next()) {
				String donated=rs.getString("COUNT(REMARK)");
				l10.setText(donated);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		l10.setBounds(140,100,30,30);
		tf2=new JTextField();
		tf2.setBounds(50,270,300,30);
		
		 cb1=new JComboBox(new String[] {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland"
			,"Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"
		});
		cb1.setBounds(50,220,150,30);
		cb2=new JComboBox(new String[] {"Ahmednagar","Akola","Amravati","Aurangabad","beed","bhandara","buldhana","chandrapur","Dhule","gadchiroli","gondia","hingoli","jalgaon", "jalna"
				+"","kolhapur","Latur","mumbai city","mumbai suburban","nagpur","nanded","nandurbar","nashik","osmanabad","palghar","parbhani","pune","raigad","ratnagiri","sangli","satara","shindudurg","solapur","Thane","Wardha","washim","Yavatmal"	
		});
		cb2.setBounds(250,220,150,30);
		cb1.addMouseListener(new MouseListener() {

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
		
		//p.add(tf1);
		p.add(tf2);
		
		p.add(cb1);
		p.add(cb2);
		
		 
		
		JButton b=new JButton("search");
		b.setBounds(450,220,100,30);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//String state=cb1.getSelectedItem().toString();
				String district=cb2.getSelectedItem().toString();
			
		    m=new DefaultListModel();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bloodworld","root","Avi@6641");
				String sql="SELECT CAMP FROM CAMPSEARCH WHERE DISTRICTS='"+district+"' ";
				PreparedStatement ps= con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				System.out.println(rs);
				//rs.next();
				// String camp=rs.getString("camp");
				// System.out.println(camp);
				while(rs.next()) {
				   String camp = rs.getString("camp");
				    m.addElement(camp);
					list.setModel(m);
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			f1.setVisible(true);
			
			}
			
		});
		p.add(b);


		JMenuBar mb=new JMenuBar();
	     JMenu menu= new JMenu("Menu");
	     JMenu submenu=new JMenu("Sub Menu");
	    JMenuItem i1=new JMenuItem("Registration Details");
	    menu.add(i1);
	     mb.add(menu);
	     f2.setJMenuBar(mb);
	     i1.addActionListener(new ActionListener() {



			public void actionPerformed(ActionEvent arg0) {
				new donorPage2();


				
			}
	    	 
	     });
	     logout=new JLabel(new ImageIcon("D:\\mini project\\images\\logout.png"));
			logout.setText("Logout");
			logout.setBounds(600,0,80,50);
			logout.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent arg0) {
					new donorPage();
					f2.setVisible(false);
					
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
			p.add(logout);
			pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
			bgimage=new JLabel("",pic,JLabel.CENTER);
			bgimage.setBounds(0,0,700,500);
			p.add(bgimage);
			
			
			 f1=new JFrame("");
			
			 list=new JList<String>(camp1);
			
			
			JScrollPane sp=new JScrollPane(list);
			sp.setPreferredSize(new Dimension(500,200));
			list.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent arg0) {
					String get=(String) list.getSelectedValue();
					tf2.setText(get);
					
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
			
			
			
			f1.getContentPane().add(sp,BorderLayout.CENTER);
			
			f1.setSize(500,300);
			f1.setLocationRelativeTo(null);
			f1.setVisible(false);
			f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



		
		    f2.add(p);
		    f2.setLayout(null);
		    p.setBackground(Color.white);
		    p.setLayout(null);
		    p.setSize(700,500);
			f2.setSize(700,500);
			f2.setVisible(true);
			p.setVisible(true);
			f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

			
		
	}
	
	public static void main(String[] args) {
		
		new donorPage1();
		
		



	}

}
