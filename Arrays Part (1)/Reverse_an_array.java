public class Reverse_an_array {
    public static void Reverse_array(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (end > start) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Reverse_array(arr);
    }
}