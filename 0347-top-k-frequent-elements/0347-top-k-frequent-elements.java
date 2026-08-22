class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Min-Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll(); // remove smallest freq
            }
        }

        // Step 3: Collect result
        int[] res = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            res[i++] = heap.poll().getKey();
        }
        return res;
    }
}