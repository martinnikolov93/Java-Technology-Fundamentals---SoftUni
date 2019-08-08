

public class tests {
    public static void main(String[] args) {

        int[] nums1 = {10,20,30,40}; // length 4
        int[] nums2 = {1,2,3,4,5,6};// length 6

        nums2 = nums1;

        System.out.println(nums2.length); // length 4
    }
}
