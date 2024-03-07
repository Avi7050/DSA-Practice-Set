public class PrefixSum {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    /**By Using extra array space */
    static int[] prefixSumNewArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
    /**Without Using extra array space */
    static void prefixSum(int[] arr) {
        int n = arr.length;
        arr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        printArray(arr);
        prefixSum(arr);
        printArray(arr);
    }
}
