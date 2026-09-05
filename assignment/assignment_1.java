public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;

        // Calculate products of elements to the left
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Multiply with products of elements to the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}