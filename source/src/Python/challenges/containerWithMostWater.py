from typing import List


class maxContainer:
    def maxArea(self, height) -> int:
        maxarea = 0
        start = 0
        end = len(height) - 1
        minimum = 0

        while start < end:

            area = (end - start) * min(height[start], height[end])
            if area > maxarea:
                maxarea = area

            minimum = height[start]*(end-start)

            if minimum > maxarea:
                end -= 1
            else:
                start += 1


        return maxarea
