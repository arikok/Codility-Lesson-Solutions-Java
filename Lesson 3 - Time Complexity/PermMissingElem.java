class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int count = A.length + 1;
        
        int sum = (count * (count+1)) / 2;
        int calcSum = 0;
        
        for(int i=0;i<A.length;i++){
            
            calcSum += A[i];
            
        }
        return sum-calcSum;
        
    }
}