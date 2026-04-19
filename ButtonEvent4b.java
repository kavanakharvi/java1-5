package github_repository;



	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class ButtonEvent4b implements ActionListener {

	    JFrame frame;
	    JButton btnIndia, btnSrilanka;
	    JLabel label;

	    public ButtonEvent4b() {

	      
	        frame = new JFrame("Button Event Demo");

	    
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	    
	        label = new JLabel("Press a button");
	        label.setHorizontalAlignment(JLabel.CENTER);
	        label.setFont(new Font("Arial", Font.PLAIN, 20));

	       
	        btnIndia.setBounds(100, 100, 100, 40);
	        btnSrilanka.setBounds(250, 100, 120, 40);
	        label.setBounds(100, 50, 300, 30);

	     
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	      
	        frame.add(btnIndia);
	        frame.add(btnSrilanka);
	        frame.add(label);

	     
	        frame.setSize(500, 300);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	   
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            label.setText("Srilanka is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new ButtonEvent4b();
	    }
	}
