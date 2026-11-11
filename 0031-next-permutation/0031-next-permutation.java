class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length; 
        int index = -1;
        for(int i = n -1 ; i>0 ; i--){
            if(nums[i-1]<nums[i]){
                index = i-1;
                break;
            }
        }
if(index != -1){
    int swap_index= index;
 for(int j=n-1 ; j>=index+1;j--){
    if(nums[j]>nums[index]){
        swap_index=j;
        break;
    }
 }
 int temp = nums[index];
 nums[index] = nums[swap_index];
 nums[swap_index] = temp;
}
 int left = index+1;
 int right = n - 1;
 while(left<right){
    int swa = nums[left];
    nums[left] = nums[right];
    nums[right] = swa;
 left++;
 right--;
    }
    }
}