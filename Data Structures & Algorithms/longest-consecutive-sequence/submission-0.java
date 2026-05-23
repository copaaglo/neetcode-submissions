class Solution {
    int longest = 0;
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet <> ();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            for (int num : set) {
                 if (!set.contains (num - 1)) {
                        int current = num; 
                        int sequence = 1;
                            while (set.contains(current +1)){
                                current++;
                                sequence++;
                            }
                            longest = Math.max(longest, sequence);
                     }
            }
            return longest;      
    }
}