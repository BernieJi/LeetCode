package com.khh;

public class MergeSortedArray88Easy {
	class Solution {
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = m-1 , j = n-1 , t = m + n -1;
	        while(i>=0 && j>=0){
	            if(nums1[i] > nums2[j]){
	                nums1[t] = nums1[i];
	                i--;
	                t--;
	            }else{
	                nums1[t] = nums2[j];
	                j--;
	                t--;
	            }
	        }
	        while(j>=0 && t>=0){
	            nums1[t] = nums2[j];
	            j--;
	            t--;
	            }
	        
	    }
	}

}
