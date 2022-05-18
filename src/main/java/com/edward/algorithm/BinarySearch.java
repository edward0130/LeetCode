package com.edward.algorithm;

import com.edward.problems.P704;

/**
 *
 * 二分查找
 *
 * 相关题目：704
 *
 */
public class BinarySearch {


    /**
     * 情形1：  = target
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        int c = 0;
        while(l<=r)
        {
            c = l+(r-l)/2;
            if(nums[c]==target)
            {
                return c;
            }
            else if(nums[c]<target)  //中间结果<target; 将左侧边界移到中间值+1;
            {
                l = c + 1;
            }
            else {           //中间结果>target; 将右侧边界移到中间位置-1;
                r = c - 1;
            }
        }
        return -1;
    }

    /**
     * 情形1：  >= target
     *  返回结果为 >= target 的元素；
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search1(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        int c = 0;
        while(l<=r)
        {
            c = l+(r-l)/2;
            if(nums[c]==target)
            {
                return c;
            }
            if(nums[c]<target)  //中间结果<target; 将左侧边界移到中间值位置+1;
            {
                l = c + 1;
            }
            else {           //中间结果>target; 将右侧边界移到中间位置-1;
                r = c - 1;
            }
        }
        return l==nums.length?-1:l;
    }

    /**
     * 情形1：  <= target
     *  返回结果为 <= target 的元素；
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search2(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        int c = 0;
        while(l<=r)
        {
            c = l+(r-l)/2;
            if(nums[c]==target)
            {
                return c;
            }
            if(nums[c]<target)  //中间结果<target; 将左侧边界移到中间值位置+1;
            {
                l = c + 1;
            }
            else {           //中间结果>target; 将右侧边界移到中间位置-1;
                r = c - 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = {-1,3,4,5,6,9};
        int target = -4;
        int ret = BinarySearch.search2(nums, target);
        System.out.println(ret);
    }
}
