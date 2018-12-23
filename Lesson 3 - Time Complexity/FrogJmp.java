// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        if(X==Y){
            return 0;
        }
        
        int distance = Y-X;
        double steps = Math.ceil((double)distance/D);
        
        return (int) steps;
        
    }
}  