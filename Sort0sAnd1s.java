public class Sort0sAnd1s {
    static void sortZeros(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            if(arr[start] != 0){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;
        }
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0};
        sortZeros(arr);
        printArray(arr);
    }
}
