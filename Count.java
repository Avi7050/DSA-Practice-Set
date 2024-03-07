public class Count {
    static int noOfOccurence(int[] arr, int x){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {1,0,3,0,5};
        int count = noOfOccurence(arr, 0);
        System.out.println("count: " + count);
    }
}
