package com.gold.lett;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by yixiaoshuang on 2017/9/11.
 * https://leetcode.com/problems/two-sum/description/
 * 实现 数组中两数之和=指定数,即 A+B=T
 */
public class TwoSum {

    public static void main(String args[]){
        /**
         * 1.多层嵌套循环不可取，时间复杂度高
         * 2.即 T- A/B = A/B,指定数 - 其中一个数，肯定在数组中。
         */
        int nums[]=new int[]{2,7,11,15,23};
        int target= 13;
        Integer sum []= twoSum(nums,target);
        System.out.println("index:"+sum[0]+";"+sum[1]);
    }

    public static Integer [] twoSum(int a [],int target){
        Integer sum [] = new Integer[2];
        Map<Integer,Integer> map = Maps.newHashMap();
        for(int i=0,j=a.length;i<j;i++){
            if (map.containsKey(target-a[i])){
                sum[0]=i;
                sum[1]=map.get(target-a[i]);
                break;
            }
            map.put(a[i],i);
        }

        return sum;
    }

}
