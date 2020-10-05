package com.concepts.CustomException;

class DivideByZeroException extends Exception
{
    public DivideByZeroException(String message)
    {
        super(message);

    }
}
class Calculate
{

    public static void performCalculation() throws DivideByZeroException {
      int a=10;
      int b=0;

      try {
          int c=a/b;
      }
      catch (Exception ex)
      {
          throw new DivideByZeroException("Divide by zero is not a valid calculation");
      }

    }
}
public class Calculator {

    public static void main(String[] args) throws DivideByZeroException {

        Calculate.performCalculation();
    }
}
