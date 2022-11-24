package com.test.exception;


class StringTest
{
    public void stringLength(String st)
    {
        
            if(st!=null)
            {
                System.out.println(st.length());
            }
            else
            {
                throw new NullPointerException("String is null!!");
            }
    
    }
    
}

public class ThrowExample {

    public static void main(String[] args)
    {
        
        StringTest ob=new StringTest();
        String st=null;
        try
        {
          ob.stringLength(st);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    }
