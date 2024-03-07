import java.util.Arrays;
public class SmallestAndLargest {
    /**
     * kth smallest and largest
     * element
     */
    static int[] smallestAndLargest(int[] arr, int k){
        Arrays.sort(arr);
        int[] ans = {arr[k-1],arr[arr.length-k]};
        return ans;
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,3};
        int[] ans = smallestAndLargest(arr,3);
        printArray(ans);

    }
}
