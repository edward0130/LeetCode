package com.edward.problems;

/**
 * 二分查找
 *
 * 基础的二分查找算法
 *
 */
public class P704 {
    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        int c ;
        while(l<=r)
        {
            c = l+(r-l)/2;
            if(nums[c]==target)
            {
                return c;
            }
            else if(nums[c]<target)
            {
                l = c + 1;
            }
            else {
                r = c - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,3,4,5,6,9};
        int target = 9;
        int ret = P704.search(nums, target);
        System.out.println(ret);
    }
}
