package array;

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,7,9,11,13};
        int target = 16;
        int index =searchInsert(nums , target );
        System.out.print(index);

    }
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        if (nums[length / 2] < target) {
            for (int i = length / 2; i < length; i++) {
                if (nums[i] > target) {
                    return i;
                } else if (i == length - 1) {
                    return (i + 1);
                }
            }

        } else if (nums[length / 2] > target) {
            for (int i = length / 2; i >= 0; i--) {
                if (nums[i] < target) {
                    return (i + 1);
                } else if (nums[0] > target) {
                    return 0;
                }
            }

        }
            return 0;

    }
}
