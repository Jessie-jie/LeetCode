package com.jessie.exercise;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Q5 {
    public static void main(String[] args) {
        Q5 q5 = new Q5();

        String s = q5.longestPalindrome("aa");
        System.out.println(s);
    }

    public String longestPalindrome(String s){
        int length = s.length();
        if(length == 1){
            return s;
        }

        for(int i = length; i > 0; i--){
            for(int j = 0; j <= length - i; j++){
                String ts =s.substring(j, j+i);
                if (isPalindrome(ts)){
                    return ts;
                }
            }

        }
        return "";
    }

    public boolean isPalindrome(String s){
        int length = s.length();
        if (length == 0){
            return false;
        }
        for (int i = 0; i < length/2; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

}
