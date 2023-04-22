package interviewQsts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstRepeatingElement {
    private static Integer findRepeatingElementOptimalApproach(int[] a) {
        List<Integer> resultantArr = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i<a.length-1;i++) {
            if (hashMap.containsKey(a[i])){
                return a[i];
            }else {
                hashMap.put(a[i],1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {1,2,2,2,3,4,5,1,2};
        Integer ans = findRepeatingElementOptimalApproach(A);
        System.out.println(ans);
    }


}
