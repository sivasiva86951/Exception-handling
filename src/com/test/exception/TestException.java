package com.test.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestException {

	public static void main(String[] args) {
		
		int a=0,b=0;
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number:");
		a=Integer.parseInt(br.readLine());// 1 - "1"
			
		System.out.println("Enter any number:");
		b=Integer.parseInt(br.readLine());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(b));
		
		System.out.println(a/0); //Unchecked exception
		
		
		}
		
		catch(Exception h)
		{
			System.out.println("Error Occurred!!");
			System.out.println(h.getMessage());
		}
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(Math.pow(a, b));
		}
	}

