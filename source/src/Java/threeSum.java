package Java;

import java.util.*;

public class threeSum {

    public static List<List<Integer>> solution(int[] nums){

        List<List<Integer>> list = new ArrayList<>();

        int length = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < length - 2; i++){
            for(int j = i + 1; j < length - 1; j++){
                for(int k = j + 1; k < length; k++){

                    if((nums[i]+nums[j]+nums[k])==0){
                        List<Integer> toAdd = new ArrayList<>();
                        toAdd.add(nums[i]);
                        toAdd.add(nums[j]);
                        toAdd.add(nums[k]);
                        Collections.sort(toAdd);
                        if(!list.contains(toAdd)) list.add(toAdd);
                    }
                }
            }
        }

        return list;
    }


}
