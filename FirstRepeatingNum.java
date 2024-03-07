public class FirstRepeatingNum {
    static int firstRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                    
                }
            }
        }
        return -1;
    }

    static int lastRepeat(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 3, 5 , 5};
        int firstRepeat = firstRepeat(arr);
        System.out.println("First Repeating Number = " + firstRepeat);
        int lastRepeat = lastRepeat(arr);
        System.out.println("Last Repeating Number = " + lastRepeat);
    }
}
