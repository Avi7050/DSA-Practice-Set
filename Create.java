public class Create {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}