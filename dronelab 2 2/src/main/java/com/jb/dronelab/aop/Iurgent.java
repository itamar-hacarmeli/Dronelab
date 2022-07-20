package com.jb.dronelab.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//target - on what we are looking at
@Target({ElementType.TYPE,  //looking on class
        ElementType.METHOD, //looking on method
        ElementType.FIELD}) //looking on field (property)
///when we need it
@Retention(RetentionPolicy.RUNTIME)
public @interface Iurgent {
}
