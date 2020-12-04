package com.zoey.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * 示例 1：
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class LeeCode17 {
    static Boolean isUnique(String astr) {
        char[] chars=astr.toCharArray();
        Set set=new HashSet<>();
        for(int i=0;i<chars.length;i++){
            set.add(chars[i]);
        }
        Boolean flag=chars.length==set.size();
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(isUnique("abcd"));
    }
}
