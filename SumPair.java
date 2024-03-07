public class SumPair {
    static int pairSum(int[] arr, int sum){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.print(arr[i] + "," + arr[j] + " = " + sum);
                    System.out.println();
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int count = pairSum(arr, 10);
        System.out.println("Total Pair = " +count);
    }
}
