class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int nums [] = new int[n];

        for(int i=0; i<n; i++){
           int greaterIdx = -1;  

            for (int j = nums2.length - 1; j >= 0; j--) {  
                if (nums2[j] == nums1[i]) {  
                    break;  
                }  

                if (nums2[j] > nums1[i]) {  
                    greaterIdx = nums2[j];  
                }  
            }  
            nums[i] = greaterIdx;  
        }  

        return nums;  
    }  
}  