import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        if(A.length == 1){
            return A[0];
        }
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        
        for(int i=0;i<A.length;i++){
            if(hmap.containsKey(A[i])){
                hmap.remove(A[i]);
            }else{
                hmap.put(A[i],A[i]);
            }
        }
        
        int unpaired = (int) hmap.values().toArray()[0];
        
        return unpaired;
    }
}