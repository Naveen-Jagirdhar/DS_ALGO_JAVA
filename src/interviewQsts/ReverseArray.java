package interviewQsts;

public class ReverseArray {

    private static void reverseArray(int[] a) {
        for (int i= 0; i< a.length/2;i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        System.out.println("Before reverse:"+ A);
        reverseArray(A);
        System.out.println("After reverse:"+ A);
    }


}
