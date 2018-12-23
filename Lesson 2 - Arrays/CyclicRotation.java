// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        for(int j=0;j<K;j++){
        
            int lastItem = A[A.length-1];
            for(int i=A.length-1;0<i;i--){
                A[i] = A[i-1];
            }
            A[0] = lastItem;    
            
        }
        
        return A;
        
    }
}