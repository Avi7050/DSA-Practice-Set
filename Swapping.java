public class Swapping {
    static void swapping(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a : " + a);
        System.out.println("After Swapping b : " + b);
    }
    static void swappingWithoutTemp(int a, int b){
        // a = a + b;
        // b = a - b;
        // a = a - b;
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After Swapping a : " + a);
        System.out.println("After Swapping b : " + b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping a : " + a);
        System.out.println("Before Swapping b : " + b);
        swapping(a, b);
        swappingWithoutTemp(a, b);
    }
}
