package com.test.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResourceClosing {

    public static void main(String[] args) {
        
        //try block with autoclosable resource
        try(
                BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
                Scanner scan=new Scanner(System.in);
                InputStreamReader ins=new InputStreamReader(System.in);
            )
        {
            
            System.out.println("Enter a number:");
            int a=Integer.parseInt(ob.readLine());
            int i=1;
            while(i<=a)
            {
                System.out.println(i);
                i=i+1;
            }
            
        }
        catch(Exception e)
        {   System.out.println(e.getClass());
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            
        }
    
    }

}
