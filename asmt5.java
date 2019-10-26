// Season and PrintGPA methods
//
// String season(int,int) :
// returns the name of the season in which the given day and month falls
// 
// void printGPA () :
// takes Scanner input of student name, number of grades, and grades
// prints student name and average of grades
//
// By Crosby Allison

import java.util.Scanner;

public class Assignment5 {
   
    public static String season (int month, int day) {
        if ( month < 3 || (month == 3 && day <= 15) || (month == 12 && day >= 16) ) {
            return "Winter";
        } else if ( (3 < month && month < 6) || (month == 3 && day >= 16) || (month == 6 && day <= 15) ) {
            return "Spring";
        } else if ( (6 < month && month < 9) || (month == 6 && day >= 16) || (month == 9 && day <= 15) ) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
    
    // initialize Scanner for printGPA input
    static Scanner in = new Scanner(System.in);

    public static void printGPA () {
        System.out.print("Enter a student record: ");
        String[] records = in.nextLine().split(" ");

        double gpa = 0.0;

        for ( int i = 2; i < records.length; i++ ) {
            gpa += Integer.parseInt(records[i]);
        }

        gpa /= Integer.parseInt(records[1]);

        System.out.print(records[0] + "'s grade is " + gpa);
    }

    public static void main (String[] args) {
        System.out.println( season(4,1) );
        printGPA();
    }
}