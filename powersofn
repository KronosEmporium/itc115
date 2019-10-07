import java.util.Arrays;

public class MyClass {
    public static void printPowersOfN(int n, int count) {
        int[] powerArray = new int[count+1];
        
        for ( int i = 0; i < count + 1; i++ ) {
            powerArray[i] = (int)Math.pow(n,i);  
        }
        
        System.out.println( formatPowerArrayString( Arrays.toString(powerArray) ) );
    }
    
    static String formatPowerArrayString(String arr) {
        return arr.replaceAll("[\\[\\,\\]]","");
    }
    
    public static void main(String[] args) {
        printPowersOfN(2,7);
        printPowersOfN(5,3);
    }
}
