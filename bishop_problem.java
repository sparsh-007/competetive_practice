public class Solution {
    public int solve(int A, int B) {
        return(Math.min(A-1,B-1)+Math.min(B-1,8-A)+Math.min(8-B,A-1)+Math.min(8-A,8-B));
    }
}

