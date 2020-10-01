package com.concepts.StaticKeywordExample;

/* The static blocks get executed as soon as the class file get loaded into memory by Java ClassLoader. */

/*
Considering the example of Spring, in Spring instance creation is handled by Spring, so if this
class is marked as Component, then the instance creation will happen, which will be available in application
context and static variable configValue will have This is config value ready to use.
*/
public class StaticBlockExample {

    private static String configValue;
    private String value;
    static
    {
        configValue="This is a config value";
        System.out.println("Inside static block "+configValue);
    }
    {
        value="This is not a config value";
        System.out.println("Inside the instance block "+value);
    }
}
