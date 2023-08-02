class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        //exactly k =atmost (k)- atmost(k-1)
        return (int) (atmostK(nums, set.size()) - atmostK(nums, set.size() - 1));
    }

    public long atmostK(int[] nums, int k) {
        int j = 0, i = 0, n = nums.length;
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.size() > k) {
                count += j - i;  //no of subarrays obeying atmost k condition
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            j++;
        }
        count += ((long) (j - i + 1) * (j - i)) / 2;  //remaining subarrays from [i,n-1]
        return count;
    }
}