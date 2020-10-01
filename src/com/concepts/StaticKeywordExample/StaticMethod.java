package com.concepts.StaticKeywordExample;

/*
static methods are associated with class not object, hence the overriding of the static method is not
possible as, when the method overriding is done, the call to the method depends upon the type of object
that the reference holds , while in case of static method, the call to method depends upon the type
of reference variable.
*/
class A
{
    public void sayHello()
    {
        System.out.println("Hello");
    }


    public static void sayHi()
    {
        System.out.println("Hi");
    }
}
class B extends A
{
    public void sayHello()
    {
        System.out.println("This is overriding saying Hello");
    }

    //this is not method overriding, it just Method Hiding.
    public static void sayHi()
    {
        System.out.println("Hi");
    }
}
public class StaticMethod {

    public static void main(String[] args) {

        /*
        the call to the method depends upon the type of object
        that the reference holds
        */
        A a=new A();
        a.sayHello();

        A a1=new B();
        a1.sayHello();

        B b=new B();

        //THIS IS NOT CORRECT AS STATIC METHOD IS ACCESSED WITH instance,
        //the call to method depends upon the type
        //of reference variable.
        a.sayHi();
        a1.sayHi();
        b.sayHi();
    }
}
