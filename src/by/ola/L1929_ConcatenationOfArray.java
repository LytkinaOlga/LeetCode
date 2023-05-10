package by.ola;

public class L1929_ConcatenationOfArray
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int i = 0; i < nums.length * 2; i ++){
            if (i < nums.length){
                result[i] = nums[i];
            }
            else {
                int j = i-nums.length;
                result[i] = nums[j];
            }
        }
        return result;
    }

    public static int[] getConcatenationShort(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int i = 0; i < nums.length * 2; i ++){
            result[i + nums.length] = result[i] = nums[i];
        }
        return result;
    }
}
