package com.jessie.knowledge;

/**
 * 递归
 * 递归的三大要素
 * 第一要素：明确你这个函数想要干什么
 * 第二要素：寻找递归结束条件
 * 第三要素：找出函数的等价关系式
 */
public class DiGui {
    public static void main(String[] args) {
        DiGui dg = new DiGui();
//        int rtn1 = dg.case1(7);
//        System.out.println(rtn1);

        int rtn2 = dg.case2(3);
        System.out.println(rtn2);
    }

    /**
     * 案例1：斐波那契数列
     * 斐波那契数列的是这样一个数列：1、1、2、3、5、8、13、21、34....，
     * 即第一项 f(1) = 1,第二项 f(2) = 1.....,第 n 项目为 f(n) = f(n-1) + f(n-2)。
     * 求第 n 项的值是多少。
     */
    public int case1(int n){
        if(n <= 2){
            return 1;
        }

        return case1(n-1) + case1(n-2);
    }

    /**
     * 案案例2：小青蛙跳台阶
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public int case2(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return case2(n-1) + case1(n-2);
    }
}
