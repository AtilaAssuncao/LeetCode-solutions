class Solution {
    public void rotate(int[] nums, int k) {
        int[] aux = new int[nums.length];

        if(k > nums.length)
            k = k % nums.length;

        int j = 0, m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                aux[i] = nums[j];
                j++;
            }
            if ((i + k) >= nums.length) {
                aux[m] = nums[i];
                m++;
            }
        }
        System.arraycopy(aux, 0, nums, 0, nums.length);
    }
}