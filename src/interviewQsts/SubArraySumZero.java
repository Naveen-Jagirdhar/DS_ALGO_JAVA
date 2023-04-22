package interviewQsts;

import java.util.HashMap;

/* Find the sub Array with sum zero in given array */
public class SubArraySumZero {

    private static int burteForceApproach(int[] a) {
        for (int i=0;i<a.length-1;i++) {
            int sum =a[i];
            for (int j= i+1;j <a.length-1;j++) {
                sum += a[j];
            }
            if (sum == 0) {
                return 1;
            }
        }
        return -1;
    }

    private static int optimisedApproach(int[] a) {
        int[] prefixArr = new int[a.length];
        prefixArr[0] = a[0];
        for (int i=1 ;i< a.length-1;i++) {
            prefixArr[i] = prefixArr[i-1]+a[i];
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i<prefixArr.length;i++) {
            if (prefixArr[i] ==0) {
                return 1;
            } else if (hashMap.containsKey(a[i])) {
                return 1;
            } else {
                hashMap.put(a[i],1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {4,2,-3,1,3};
        int ans = burteForceApproach(A);
        System.out.println("answer for bruteforce approach:"+ans);
        int ans1 = optimisedApproach(A);
        System.out.println("answer for optimised approach:"+ ans1);
    }
}