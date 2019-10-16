//*******************************************************************
//  repl
//
// Concatenates string s r times, if r is sub 1 returns empty string.
//By: Crosby Allison
//Date: 10/16
//*******************************************************************

public class Repl {
    
    public String repl (String s, int r) {
        String concat = "";

        if ( r > 0 ) {
            for ( int i = 0; i < r; i++ ) {
                concat += s;
            }
        }

        return concat;
    }
    
    public static void main (String[] args) {
        
        try {
            repl("hello", 3);
        } except (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}