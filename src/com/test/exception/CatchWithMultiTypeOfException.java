package com.test.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchWithMultiTypeOfException {

    public static void main(String[] args) {
       
          try(
                    
                    Scanner scan=new Scanner(System.in);
         
                )
        {
            String st=null;
            System.out.println(10/0);
            System.out.println("Enter a number:");
            int a=scan.nextInt();
            System.out.println(st.length());
            System.out.println(st.charAt(0));
        }
        catch(NumberFormatException | ArithmeticException e)
        {
            System.out.println("Number Format Exception or ArithmeticException occured!!");
        }
        catch (InputMismatchException e ) {
            System.out.println("InputMismatchException occurred!!" );
        }
        
        catch (StringIndexOutOfBoundsException e ) {
            System.out.println("StringIndexOutOfBoundsException occurred!!" );
        }
        

    }

}
