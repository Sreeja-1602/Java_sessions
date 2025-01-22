class Day11 {
    public int maxFrequencyElements(int[] nums) {
        
        int[] freq = new int[101];
        for(int i = 0;i<nums.length;i++) {
            int val = nums[i];
            freq[val] = freq[val] + 1;

        }
        int max =0;
        for(int i =0;i<freq.length;i++){
            
            max = Math.max(freq[i],max);

        }
        int total =0;
         for(int i =0;i<freq.length;i++){
            if(freq[i] ==max){
                total += max;
            }
         }
         return total;
    }
} 