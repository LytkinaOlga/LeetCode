package by.ola;

public class L704_BinarySearch
{
    public static void main(String[] args)
    {
        int[] nums = {-2, 0, 3, 4, 15, 16, 18, 22, 23, 35, 60 };
//        int[] nums = {22};
        int target = 22;
        System.out.println("Result: " + search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }
            if (nums[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
