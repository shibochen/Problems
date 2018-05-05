class Solution {
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0;
    for(int i = 0; i < A.length; i++){
        ones = (ones ^ A[i]) & ~twos;
        twos = (twos ^ A[i]) & ~ones;
    }
    return ones;
    }
}

/*
Method: Bit Manipulation

Time: O(n)   Space: O(1)
*/
