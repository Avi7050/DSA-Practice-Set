public class RotateArray {
    static void rotateArrayLeft(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, k, arr.length - k);
        reverse(arr, 0, k - 1);
        reverse(arr, 0, arr.length - 1);
    }

    static int[] reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static int[] rotateArrayRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println("rotate Array Leftward");
        // rotateArrayLeft(arr, 2);
        // printArray(arr);
        System.out.println("rotate Array Rightward");
        int[] ans = rotateArrayRight(arr, 2);
        printArray(ans);
    }
}
