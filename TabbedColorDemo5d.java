package github_repository;



	import javax.swing.*;
	import java.awt.*;

	public class TabbedColorDemo5d {

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Color Tabs");

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        tabbedPane.addTab("CYAN", cyanPanel);
	        tabbedPane.addTab("MAGENTA", magentaPanel);
	        tabbedPane.addTab("YELLOW", yellowPanel);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}