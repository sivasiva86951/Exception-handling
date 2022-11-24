package com.test.exception;

public class MultiCatchException {

	public static void main(String[] args) {
		int array[]=new int[10];
		
		try
		{
						
			System.out.println(array[13]);
			System.out.println(array[5]/0); //Arithmetic Exception
			System.out.println(array.length);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Throwable e) //Generic type of exception hamling
		{
			System.out.println(e);
		}
		
		
	}

}

