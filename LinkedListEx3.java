package github_repository;
import java.util.*;
public class LinkedListEx3 {

	

	
	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        list.add("Red");
	        list.add("Blue");
	        list.add("Green");

	        System.out.println("Before adding: " + list);

	        list.offerLast("Pink");

	        System.out.println("After adding at end: " + list);
	    }
	}
