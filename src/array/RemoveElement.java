package array;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = removeElement(nums , val);
        System.out.print(k);
    }
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if(nums[i] == val) {
                int temp = nums[i];
                for(int s = i; s < length - 1; s++) {
                    nums[s] = nums[s+1];
                }
                nums[length-1] = temp;
                length--;
                i--;
            }
        }
        return length;
    }
    }

