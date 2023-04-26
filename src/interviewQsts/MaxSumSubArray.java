package interviewQsts;

public class MaxSumSubArray {

    /* BruteForce Approach */
    private static int bruteForceMaxSumSubArray(int[] a) {
        int result =Integer.MIN_VALUE;
        for (int i=0; i< a.length-1;i++) {
            int sum= a[i];
            for (int j=i+1; j < a.length-1;j++) {
                sum += a[j];
                if (sum <0) {
                    sum =0;
                }
                result = Math.max(result,sum);
            }
        }
        return result;
    }

    /* This is the optimized approach where TC is O(n) & SC is O(1) */
    private static int maxSumSubArray(int[] a) {
        int sum =0, result =Integer.MIN_VALUE;
        for (int i :a) {
            sum += i;
            if (sum <0) {
                sum = 0;
            }
            result = Math.max(sum,result);
        }
        return result;
    }
    public static void main(String[] args) {

        int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sum of SubArray:" + maxSumSubArray(A));
        System.out.println("Max Sum BruteForce Approach:" + bruteForceMaxSumSubArray(A));
    }


}
