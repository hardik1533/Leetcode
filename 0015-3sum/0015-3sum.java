class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length,sum;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < length; i++){
            if(i > 0  && nums[i] == nums[i - 1]) continue;
           int j = i + 1, k = length - 1;
                   while(j < k){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum < 0) j++;
                    else if(sum > 0) k--;
                    else{
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list.add(list1);
                        j++;
                        k--;
                        while(j < k && nums[j] == nums[j - 1]) j++;
                    }
                   }
                
        }

        return list;
    }
}