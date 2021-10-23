package com.mph.Mypack;

public class Calculate {
	
	public int add(int... number) {
		int result =0;
			for(int i: number)
			{
				result +=i;
			}		
		return result;
	}
	public int multiply(int... number) {
		int result =1;
			for(int i: number)
			{
				result *=i;
			}		
		return result;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(45,52));
		System.out.println(c.add(1,2,3,4));
		System.out.println(c.multiply(56,12,52));
		System.out.println(c.add(4,5));
	}
	
}