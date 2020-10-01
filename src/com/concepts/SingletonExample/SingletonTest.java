package com.concepts.SingletonExample;

/* To check if the instance created using SingletonLazy are equals,this can be done by checking there hashcode. */

import java.lang.reflect.Constructor;

/* Because when two objects are equals there hashcode is also equal. */
public class SingletonTest {

    public void checkIfSingletonsExists()
    {
        SingletonLazyExample instance1 = SingletonLazyExample.getInstance();

        SingletonLazyExample instance2 = SingletonLazyExample.getInstance();

        //Should be same
        System.out.println("HashCode for instance 1 "+instance1.hashCode());
        System.out.println("HashCode for instance 2 "+instance2.hashCode());
    }

    public void breakSingletonUsingJavaReflecton()
    {
        SingletonLazyExample instance = SingletonLazyExample.getInstance();

        SingletonLazyExample instance2=null;
        try {
            Class<SingletonLazyExample> singletonLazyExampleClass = SingletonLazyExample.class;
            Constructor<SingletonLazyExample> declaredConstructor = singletonLazyExampleClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            instance2 = declaredConstructor.newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //Will be different
        System.out.println("HashCode for instance "+instance.hashCode());
        System.out.println("HashCode for instance2 "+instance2.hashCode());

    }

    public void breakSingletonUsingThreads()
    {
        Thread t1=new Thread(() -> {
            SingletonLazyExample instance = SingletonLazyExample.getInstance();
            System.out.println("HashCode for instance "+instance.hashCode());
        });

        Thread t2=new Thread(() -> {
            SingletonLazyExample instance2 = SingletonLazyExample.getInstance();
            System.out.println("HashCode for instance2 "+instance2.hashCode());
        });

        t1.start();
        t2.start();
    }

}
