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

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, 5 };
        int[] pref = prefixSumNewArray(arr);
        printArray(arr);
        printArray(pref);
    }
}
