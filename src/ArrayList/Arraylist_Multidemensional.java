package ArrayList;

import java.util.*;

public class Arraylist_Multidemensional {
    public static void main(String[] args) {
        // Main ArrayList (outer list)
        ArrayList<ArrayList<Integer>> studentMarks = new ArrayList<>();

        // Student 1 marks
        ArrayList<Integer> student1 = new ArrayList<>();
        student1.add(85);
        student1.add(90);
        student1.add(80);

        // Student 2 marks
        ArrayList<Integer> student2 = new ArrayList<>();
        student2.add(78);
        student2.add(88);
        student2.add(92);

        // Add to main list
        studentMarks.add(student1);
        studentMarks.add(student2);

        // Print all marks
        for (ArrayList<Integer> i :studentMarks) {
            System.out.println(i);
        }
    }
}

// jdbc connectivity code
// package Collections.Java;
//

// import java.sql.Connection;
// import java.sql.DriverManager;










// public class JdbcConnectivity {
//     public static void main(String[] args) {
//         String url = "jdbc:mysql://localhost:3306/your_database";
//         String user = "your_username";
//         String password = "your_password";


//         try {


