package github_repository;
import java.util.*;
public class program2b {
	    public static void main(String[] args) {

	        int n = 10000;

	        // StringBuffer Test
	        long startTimeBuffer = System.nanoTime();
	        StringBuffer sbuffer = new StringBuffer();

	        for (int i = 0; i < n; i++) {
	            sbuffer.append("AIET");
	        }

	        long endTimeBuffer = System.nanoTime();
	        long timeBuffer = endTimeBuffer - startTimeBuffer;

	        // StringBuilder Test
	        long startTimeBuilder = System.nanoTime();
	        StringBuilder sbuilder = new StringBuilder();

	        for (int i = 0; i < n; i++) {
	            sbuilder.append("AIET");
	        }

	        long endTimeBuilder = System.nanoTime();
	        long timeBuilder = endTimeBuilder - startTimeBuilder;

	        // Display results
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
	    }
	}