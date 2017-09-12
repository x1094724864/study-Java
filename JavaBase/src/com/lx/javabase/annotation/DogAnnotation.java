package com.lx.javabase.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
public @interface DogAnnotation {

	public String value() default "我什么都不知道，我选择 狗带！";
//	public int value2() default 15;

//	public int age();

}
