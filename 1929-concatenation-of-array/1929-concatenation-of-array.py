class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n=len(nums)
        result=[]
        for num in nums:
            result.append(num)
        return result + result