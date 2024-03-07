public class SecondLargest {
    static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    static int secondLargest(int[] arr){
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < largest(arr) && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        int secondLargest = secondLargest(arr);
        System.out.println("Second Largest = " +secondLargest);
    }
}
