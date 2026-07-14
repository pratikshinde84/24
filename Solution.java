import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==(i+1)){
                i++;
            }else if(nums[i]>nums.length||nums[i]<1){
                i++;
            }else{
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }else{
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstMissingPositive(new int[]{3,4,-1,1}));
    }
}