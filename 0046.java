class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> current = new ArrayList();
        backTracking(0, nums, result, current);
        return result;

    }

    private void backTracking(int start, int[] nums, List<List<Integer>> result, List<Integer> current) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!current.contains(nums[i])) {
                current.add(nums[i]);
                backTracking(start + 1, nums, result, current);
                current.remove(current.size() - 1);
            }
        }
    }
}
