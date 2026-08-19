class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        a=set(nums1)
        res=[]
        for n in nums2:
            if n in a:
                res.append(n)
                a.remove(n)
        return res 