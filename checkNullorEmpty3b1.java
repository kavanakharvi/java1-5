package github_repository;
import java.util.*;
public class checkNullorEmpty3b1 {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String input = "   ";
        
        if (isNullOrEmpty(input)) {
            System.out.println("String is null");
        } else {
            System.out.println("String is not empty");
        }
    }
}