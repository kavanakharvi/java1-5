package github_repository;
	import javax.swing.*;
	import java.awt.*;
	public class SwingHello4a {
	
	    public static void main(String[] args) {

	        // Create Frame
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create Label with message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");

	        // Set font: Plain, size 32
	        label.setFont(new Font("Arial", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Center alignment
	        label.setHorizontalAlignment(JLabel.CENTER);

	        // Add label to frame
	        frame.add(label);

	        // Frame settings
	        frame.setSize(800, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}
