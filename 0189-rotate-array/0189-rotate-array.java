class Solution {
    public void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    int answer[]= new int[n];
    for(int i=0;i<n;i++){
        answer[(i+k)%n]=nums[i];
    } 
    for(int i=0;i<n;i++){
        nums[i]=answer[i];
    }
    }
}