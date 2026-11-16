class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length; 
        int m = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<n){
            list.add(nums1[i]);
            i++;
        }
        while(j<m){
            list.add(nums2[j]);
            j++;
        }
        if(list.size()%2==0){
            return (list.get(list.size()/2)+list.get(list.size()/2 - 1))/2.0;
        }
        else{
            return list.get(list.size()/2);
        }
    }
}