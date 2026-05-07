public class SlidingWindow {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        int k = 3;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
        
    }
}
