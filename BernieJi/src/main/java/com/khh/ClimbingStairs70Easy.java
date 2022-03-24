package com.khh;

class Solution {
    public int climbStairs(int n) {
    	int a = 0 ,b = 1,sum = 0;
        int [] array = new int[n+1];
        array[0] = b;
        
        for(int i = 1;i <= n;i++) {
        	sum = a + b;
        	array[i] = sum;
        	a = b;
        	b = sum; 
        }
    return array[n];
    }
}