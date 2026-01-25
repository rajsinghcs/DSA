// class Solution {
//     public int[] rotateElements(int[] nums, int k) {
//         ArrayList<Integer> list= new ArrayList();
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] >= 0){
//                 list.add(nums[i]);
//             }
//         }
//         if(list.size() == 0) return nums;
//         k = k % list.size();
//         for(int i=0; i< k; i++){
//             int temp = list.remove(0);
//             list.add(temp);
//         }
//         int l = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] >= 0){
//                 nums[i] = list.get(l);
//                 l++;
//             }
//         }
//         return nums;
//     }
// }


class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> list= new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                list.add(nums[i]);
            }
        }
        if(list.size() == 0) return nums;

        k = k % list.size();
        int l = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                nums[i] = list.get((l+k)%list.size());
                l++;
            }
        }
        return nums;
    }
}