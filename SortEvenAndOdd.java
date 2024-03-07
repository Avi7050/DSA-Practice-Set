public class SortEvenAndOdd {
    static void sortEvenAndOdd(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            if((arr[start] % 2 != 0) && (arr[end] % 2 == 0)) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if(arr[start] % 2 == 0){
                start++;
            }
            if(arr[end] % 2 != 0){
                end--;
            }
           
        }
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        sortEvenAndOdd(arr);
        printArray(arr);
    }
}
