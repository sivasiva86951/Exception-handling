package com.test.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	// throws :used to declare an exception
    // void test() throws IOException	(Checked exception)	
	// throw: 
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	

	}

}

