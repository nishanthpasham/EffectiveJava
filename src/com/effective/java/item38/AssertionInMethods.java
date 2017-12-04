package com.effective.java.item38;

public class AssertionInMethods {
	
	private static void sort(long a[], int offset, int length) throws AssertionError {
		assert a != null;
		assert offset >= 0 && offset <= a.length;
		assert length >= 0 && length <= a.length - offset; // Do the computation
		}
	
	public static void main(String[] args) throws AssertionError
	{
		long a[] = new long[] {};
		int offset = -1;
		int length = 10;
		
//		throw new AssertionError();
		
		sort(a, offset, length);
	}
}
