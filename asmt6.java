//*******************************************************************
//
//  boyGirl
//
// Receives input from scanner of alternating boy and girl names and
// integers. Returns number of boys and girls and the difference
// between the sums of the boys' and girls' numbers
//By: Crosby Allison
//Date: 11/07/2019
//*******************************************************************


import java.io.File;
import java.util.Scanner;

public class Assignment6 {
    
    // Create boyGirl function, pass scanner with file as parameter
    public static void boyGirl (Scanner in) {
    
        //Initiliaze five integers with value 0:
        // b is the number of boys, g the number of girls
        // bsum and gsum are the respective sums of boy and girl numbers
        // i is the iterator for processing the scanner file
        int b,g,bsum,gsum, i;
        b = g = bsum = gsum = i = 0;

        // Continue as long as data remains in the scanner's buffer
        while (in.hasNext()) {
        
            // If there is another number in the file we want to do some calculations
            if (in.hasNextInt()) {
            
                // If the number is even (beginning with zero), it is a boy per the given input format
                if (i % 2 == 0) {
                
                    //Increment the number of boys and add the next number because it's going to be the
                    //next number in the file. We don't care about the boys' and girls' names, only the
                    //number and whether it, in a virtual array of the numbers of the file, has
                    //an even or odd index.
                    b++;
                    bsum += in.nextInt();
                } else {
                    g++;
                    gsum += in.nextInt();
                }
                
                //Increment the iterator, we have found a number and the next one (if there is one)
                //we'll want to use to update the other variables, and so on, etc.
                i++;
            } else {
            
                //If there wasn't a number next in the buffer, we need to tell the scanner to progress
                in.next();
            }
        }

        //Print formatted strings of boy and girl count, as well as the absolute value
        //of the difference between the sums
        System.out.println(String.format("%d boys, %d girls", b, g));
        System.out.println(String.format("Difference between boys' and girls' sums: %d", (Math.abs(bsum - gsum))));
    }
    
    //main method, calls boyGirl
    public static void main (String[] args) {
    
        //initilialize Scanner, pass file input in same directory, pass to boyGirl function
        Scanner input = new Scanner(new File('tas.txt'));
        boyGirl(input);
    }
}
