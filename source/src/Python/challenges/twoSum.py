from typing import List


class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        for i in range(0, len(nums)):
            if nums[i] > target: continue
            print(f"i: {i}")
            for j in range(i+1, len(nums)):
                print(f"j: {j}")
                if nums[j] > target: continue
                if nums[i] + nums[j] == target: return [i, j]
