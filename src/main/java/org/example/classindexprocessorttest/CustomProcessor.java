package org.example.classindexprocessorttest;

import org.atteo.classindex.processor.ClassIndexProcessor;

public class CustomProcessor extends ClassIndexProcessor {
    public CustomProcessor() {
        indexAnnotations(Annotation.class);
    }
}
