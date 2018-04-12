package cn.javon.leetcode.easy._217_containsduplicate;

public class RankingContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            int j =  i - 1;
            int k = nums[j+1];
            while(j > -1&& nums[j] > k){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = k;
            if(j  > -1){
                if(nums[j] == nums[j +1]){
                    return true;
                }
            }
        }
        return false;
    }

//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i=1; i<nums.length; i++){
//            if (nums[i-1] == nums[i]) return true;
//        }
//        return false;
//    }

}
