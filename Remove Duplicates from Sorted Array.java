class Solution {
   public int removeDuplicates(int[] nums) {
      // Edge case
      if (nums.length == 0)
         return 0;

      int i = 0;

      // We move the elements if not same
      for (int j = 1; j < nums.length; j++) {
         if (nums[i] != nums[j]) {
            i++;
            nums[i] = nums[j];
         }
      }

      // Return the length of array.
      return i + 1;
   }
}
