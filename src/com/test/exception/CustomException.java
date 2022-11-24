package com.test.exception;

public class CustomException {

    public static void main(String[] args) throws EmployeeNotFoundException {

        int employeeId=108;
        try
        {
        if(employeeId==101)
        {
            System.out.println("Valid employee Id!!");
        }
        else
        {
            throw new EmployeeNotFoundException("Employee id not found!!");
        }
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        

}
}
