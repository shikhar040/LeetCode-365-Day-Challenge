class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();
        int last = Integer.MIN_VALUE;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j] && nums1[i] != last) {
                intersection.add(nums1[i]);
                last = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] arr = new int[intersection.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = intersection.get(k);
        }

        return arr;
    }
}
