package com.xj.Exercise;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 */
public class Q14 {
    public static void main(String[] args) {

        Q14 q14 = new Q14();

        String[] strs = new String[3];
        strs[0] = "c";
        strs[1] = "acc";
        strs[2] = "ccc";
        String s = q14.longestCommonPrefix(strs);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs == null || strs.length == 0){
            return prefix;
        }
        if(strs[0] == null ||strs[0].length() == 0){
            return prefix;
        }
        for (int i = 1; i <= strs[0].length(); i++) {

            prefix = strs[0].substring(0,i);
            for(String s : strs){
                if(s.length() < i || s.indexOf(prefix) != 0){
                    return prefix.substring(0, prefix.length() - 1);
                }
            }
        }

        return prefix;
    }


}
