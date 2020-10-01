package com.concepts.SingletonExample;

//What is Singleton class? A design pattern which states that only one instance of the class i.e Object should be available per JVM

//Problem with this approach: Even if the instance is not required the instance will get created eagerly.
public class SingletonEagerExample {

    private static SingletonEagerExample singletonEagerInstance=new SingletonEagerExample();

    //private constructor so instantiation can not be done with new keyword i.e. outside the class.
    private SingletonEagerExample()
    {

    }

    //public method to access the instance, static so that to access with ClassName, as cant access with class instance,
    // because constructor is private
    public static SingletonEagerExample getInstance()
    {
        return singletonEagerInstance;
    }
}
