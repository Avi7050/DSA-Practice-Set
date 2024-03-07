import java.util.Arrays;

public class Practice {
    static int noOfOccurence(int[] arr, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurence(int[] arr, int x) {
        int lastOcc = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastOcc = i;
            }
        }
        return lastOcc;
    }

    static int firstOccurence(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int[] smallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    static int[] kthsmallestAndLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = { arr[k], arr[arr.length - k] };
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 4, 3, 5, 7, 6 };
        // int count = noOfOccurence(arr, 3);
        // System.out.println(count);
        // int lastOcc = lastOccurence(arr, 3);
        // System.out.println(lastOcc);
        // int firstOcc = firstOccurence(arr, 3);
        // System.out.println(firstOcc);
        // int[] ans = smallestAndLargest(arr);
        // printArray(ans);
        int[] ans = kthsmallestAndLargest(arr, 2);
        printArray(ans);
    }
}
