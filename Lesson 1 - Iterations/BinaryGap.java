// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        
        String binaryRep = Integer.toBinaryString(N);
        
        if(binaryRep.length() == 1){
            return 0;
        }
        
        int zeroCount=0;
        int maxZeroCount = 0;
        boolean firstOne=true;
        boolean zeros= false;
        
        for(int i=1;i<binaryRep.length();i++){
            
            if(binaryRep.charAt(i) == '0'){
                zeros=true;
                zeroCount ++;
            }else if(binaryRep.charAt(i) == '1'){
                if(firstOne && zeros){
                    maxZeroCount = zeroCount > maxZeroCount ? zeroCount : maxZeroCount; 
                }else{
                    firstOne = true;
                }
                zeros=false;
                zeroCount = 0;
            }
        }
        
        return maxZeroCount;
    }
}