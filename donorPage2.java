import java.awt.*;

import javax.swing.*;

public class donorPage2 {
	JLabel bgimage;
	ImageIcon pic;
	public donorPage2(){
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		pic=new ImageIcon("D:\\mini project\\images\\bloodimage.jpg");
		bgimage=new JLabel("",pic,JLabel.CENTER);
		bgimage.setBounds(0,0,700,500);
		p.add(bgimage);

	    f.add(p);
	    f.setLayout(null);
	    p.setBackground(Color.white);
	    p.setLayout(null);
	    p.setSize(700,500);
		f.setSize(700,500);
		f.setVisible(true);
		p.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new donorPage();


	}

}
