

class Twopointer {
    public static void Pointer(int a[], int target) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                System.out.println("sum found " + a[left] + " " + a[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not found");
    }
     public static void main(String[] args) {
         int a[] = { 1, 2, 3, 4, 6 };
         Pointer(a, 8);
     }
}