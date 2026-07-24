import java.util.*;

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

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}