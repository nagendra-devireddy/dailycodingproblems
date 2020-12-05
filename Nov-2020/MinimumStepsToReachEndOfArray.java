package dp;

/**
 * Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.
 * For example, [2, 0, 1, 0] returns True while [1, 1, 0, 1] returns False.
 * Also covers the answer for minimum no of steps to reach end of array
 */
public class MinimumStepsToReachEndOfArray {

    static int minJumps(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int maxElementReached=0;
        for(int i=0;i<n;i++){
            int maxJump=arr[i];
            if(maxJump>0 && maxElementReached>=i){
                for(int j=maxElementReached+1; j<n && j<=i+maxJump;j++){
                    dp[j]=dp[i]+1;
                }
                maxElementReached=Math.max(maxElementReached,maxJump+i);
            }
        }

        return dp[n-1]==0?-1:dp[n-1];
    }
}
