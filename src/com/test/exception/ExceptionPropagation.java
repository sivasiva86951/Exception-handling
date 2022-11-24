package com.test.exception;

class Sample
{
    public void a()
    {
        System.out.println("method a invoked");
        try
        {
        System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            
        }
        System.out.println("exception handled!!");
    }
    
    public void b()
    {
        
          a();
        
        System.out.println("method b invoked");
    }
    
    
    public void c()
    {
        
         b();
        
        System.out.println("method c invoked");
    }
    
        
    
}




public class ExceptionPropagation {

    public static void main(String[] args) {
        Sample sample=new Sample();
       
         sample.c();
        
    }
}
    


