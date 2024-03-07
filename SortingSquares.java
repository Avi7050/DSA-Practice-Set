public class SortingSquares {
    static int[] sortSquare(int[] arr){
        int n = arr.length;
        int start = 0, end = n - 1;
        int[] ans = new int[n];
        int k = n - 1;
        while(start <= end){
            if(Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[k--] = arr[start] * arr[start];
                start++;
            }
            else{
                ans[k--] = arr[end] * arr[end];
                end--;
            }
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-10,-4,-2,1,3,5};
        int[] ans = sortSquare(arr);
        printArray(ans);
    }
}
