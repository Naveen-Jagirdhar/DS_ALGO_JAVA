package interviewQsts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    private static void commonElementsSingleArrayBasicApproach(int[] a) {
        for (int i=0; i< a.length-1;i++) {
            int count =0;
            for (int j=i; j<a.length-1;j++) {
                if (a[i]==a[j]) {
                    count++;
                }
            }
            if (count>1) {
                System.out.print(a[i] + "\t");
            }
        }
    }
    private static ArrayList<Integer> commonElementsSingleArrayOptimalApproach(int[] a) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> resultantArray  = new ArrayList<>();
        for (int i:a) {
            if (hashMap.containsKey(i)){
                int count = 1 + hashMap.get(i);
                hashMap.put(i,count);
            } else {
                hashMap.put(i,1);
            }
        }
        for (Map.Entry<Integer,Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 1) {
                resultantArray.add(map.getKey());
            }
        }
        return resultantArray;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,3,2,1,5,2,2,1,1,1,0};
        commonElementsSingleArrayBasicApproach(A);
        ArrayList<Integer> arrayList = commonElementsSingleArrayOptimalApproach(A);
        arrayList.forEach(integer -> System.out.print(integer+"\t"));
    }
}
