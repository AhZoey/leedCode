package com.zoey.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeeCode3 {
    public static void main(String[] args) {
        String str1="abcabcbb";//3
        String str2="bbbbb";//1
        String str3="pwwkew";//3
        int length=lengthOfLongestSubstring(str3,0);
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s,int index) {
        Set<Character> set=new HashSet<>();
        int i=0;
        while(i<=s.length()-1){
            if(set.isEmpty()){
                set.add(s.charAt(i));
            }else{
                if(set.contains(s.charAt(i))){
                    break;
                }
                set.add(s.charAt(i));
            }
            i++;
        }
        if(index==s.length()-1){
            return i;
        }
        index++;
        int nextLength= lengthOfLongestSubstring(s,index);
        return nextLength>i?nextLength:i;
    }
}
