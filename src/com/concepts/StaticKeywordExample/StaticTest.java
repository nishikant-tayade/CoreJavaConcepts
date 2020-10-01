package com.concepts.StaticKeywordExample;

public class StaticTest {
    public static void main(String[] args) {
        /*
        1.Static
        Instance block in StaticBlockExampleClass will get executed the # of times, instance creation happens,
        but Static block get executed only one time as class file get loaded into memory only once.
        */
        new StaticBlockExample();
        new StaticBlockExample();

    }
}
