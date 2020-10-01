package com.concepts.SingletonExample;

public class SingletonLazyExample {

    private static SingletonLazyExample singletonLazyInstance;

    private SingletonLazyExample(){
        /*
        Prevent from reflection API breaking the singleton
        comment out this to break the singleton
        */
        if(singletonLazyInstance!=null)
        {
            throw new RuntimeException("This is singleton reporting!!");
        }
    }

    public static synchronized SingletonLazyExample getInstance()
    {
        if(singletonLazyInstance==null)
        {
            singletonLazyInstance=new SingletonLazyExample();
        }

        return  singletonLazyInstance;
    }
}
