package com.edward.problems;

/**
 * x 的平方根
 *
 * 根据二分查找算法比较 获取小于等于目标值的结果；
 */
public class P69 {
    int mySqrt(int x) {
        int l = 0;
        int r = x;
        while(l<=r)
        {
            int c = l+(r-l)/2;
            if((long)c*c == x)
                return c;
            else if((long)c*c < x)
            {
                l = c + 1;
            }
            else
            {
                r = c - 1;
            }
        }
        return r;
    }
}
