class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
            for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
                }
        List<Integer> keys = new ArrayList<>(count.keySet());
        Collections.sort(keys, (a, b) -> count.get(b) - count.get(a));
        int[] result = new int[k];
    for (int i = 0; i < k; i++) {
    result[i] = keys.get(i);
    }
    return result;
    }
}
