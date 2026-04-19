package github_repository;
import java.util.*;
public class LinkedListEx5 {




    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before swapping: " + list);

        // Swap 1st (index 0) and 3rd (index 2)
        Collections.swap(list, 0, 2);

        System.out.println("After swapping 1st and 3rd: " + list);
    }
}