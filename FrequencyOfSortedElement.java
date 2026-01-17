package com.index;

public class FrequencyOfSortedElement{
	public static void main(String[] args) {
		int[] num = {1,1,1,2,3,3,3,3,4,4};
		int n = num.length;
		int count=1;
		for(int i =1;i<n;i++) {
			if(num[i-1]==num[i]) {
				count++;
			}else {
				System.out.println(num[i-1]+" -> "+count);
				count=1;
			}
		}
		System.out.println(num[n-1]+" -> "+count);
	}
}





