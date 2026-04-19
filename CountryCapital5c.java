package github_repository;


	import javax.swing.*;
	import javax.swing.event.*;
	import java.awt.*;
	import java.util.HashMap;

	public class CountryCapital5c {

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Country Capitals");

	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Map countries to capitals
	        HashMap<String, String> capitals = new HashMap<>();
	        capitals.put("USA", "Washington D.C.");
	        capitals.put("India", "New Delhi");
	        capitals.put("Vietnam", "Hanoi");
	        capitals.put("Canada", "Ottawa");
	        capitals.put("Denmark", "Copenhagen");
	        capitals.put("France", "Paris");
	        capitals.put("Great Britain", "London");
	        capitals.put("Japan", "Tokyo");
	        capitals.put("Africa", "No single capital");
	        capitals.put("Greenland", "Nuuk");
	        capitals.put("Singapore", "Singapore");

	        JList<String> list = new JList<>(countries);

	        list.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                String selected = list.getSelectedValue();
	                if (selected != null) {
	                    System.out.println(selected + " -> " + capitals.get(selected));
	                }
	            }
	        });

	        frame.add(new JScrollPane(list));
	        frame.setSize(300, 250);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}
