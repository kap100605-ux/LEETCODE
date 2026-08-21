
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i=0;i<nums.length;i++) {
            int num= nums[i];
            if ((num >= 10 && num <= 99) ||
                ( num >= 1000 && num <= 9999 || num==100000)) {
                count++;
            }
        }

        return count;
    }
}