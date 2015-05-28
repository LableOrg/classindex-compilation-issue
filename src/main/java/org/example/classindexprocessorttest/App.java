package org.example.classindexprocessorttest;

import org.atteo.classindex.ClassIndex;

public class App {
    public static void main(String[] args) {
        System.out.println("Scanning classes...");
        for (Class<?> aClass : ClassIndex.getAnnotated(Annotation.class)) {
            System.out.println("  * Found " + aClass.getName());
        }
    }
}
