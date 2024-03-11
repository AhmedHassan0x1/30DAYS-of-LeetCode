class Problem136 {
    public int singleNumber(int[] nums) {
         int c = 0;
        int num = 0;

        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            c = 0;

            for(int j = 0; j<nums.length; j++){
                if(num == nums[j]){
                    c++;
                }
            }
            if(c == 1){
                break;
            }
        }
        return num;
    }
}