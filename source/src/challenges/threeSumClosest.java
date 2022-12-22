package challenges;

import java.util.Arrays;

public class threeSumClosest {

    public static int solution(int[] nums, int target){

        Arrays.sort(nums);
        if(nums[nums.length-1] < target){
            return nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        }
        else if(target < nums[0]){
            return nums[0]+nums[1]+nums[2];
        }

        int sum = nums[0]+nums[1]+nums[2];
        int difference = 0;

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(target < 0){
                        if(target == nums[i]+nums[j]+nums[k]) return nums[i]+nums[j]+nums[k];
                        else if((target + (nums[i]+nums[j]+nums[k])) < (target + sum)){
                            sum = nums[i]+nums[j]+nums[k];
                        }
                    }
                    else{
                        if(target == nums[i]+nums[j]+nums[k]) return nums[i]+nums[j]+nums[k];
                        else if((target - nums[i]+nums[j]+nums[k]) > (target - sum)){
                            sum = nums[i]+nums[j]+nums[k];
                        }
                    }
                }
            }
        }

        return sum;
    }

}
