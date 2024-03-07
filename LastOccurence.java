public class LastOccurence {
    static int lastOccurence(int[] arr, int x){
        int lastOccurence = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                lastOccurence = i;
            }
        }
        return lastOccurence;
    }
    public static void main(String[] args) {
        int[] arr= {1,0,3,0,5};
        int lastOccurence = lastOccurence(arr, 0);
        System.out.println("Last occurence : " + lastOccurence );
    }
}
