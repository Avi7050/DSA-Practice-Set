public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = reverse(arr);
        printArray(ans);
    }

    private static int[] reverse(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0, start = 0, end = arr.length-1;
        while (end >= start) {
            ans[j++] = arr[end--];
        }
        // for(int i=arr.length-1;i>=0;i--){
        //     ans[j++] = arr[i];
            
        // }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

   
}
