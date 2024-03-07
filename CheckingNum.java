import java.util.Scanner;

public class CheckingNum {
    /**Make Frequency Array */
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    /**Method for checking the number is available or not */
    static void check(int[] freq){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queries");
        int query = sc.nextInt();
        while(query > 0){
            System.out.println("Enter number: ");
            int target = sc.nextInt();
            if(freq[target] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            query--;
        }
        sc.close();
    }
    public static void main(String[] args) {
        int[] arr = {1,1001,3,202,345,687,990,45,3451};
        int[] freq = makeFrequencyArray(arr);
        check(freq);
    }
}
