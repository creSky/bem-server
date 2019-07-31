package com.bem.mutilDbConfig;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "master"; //该值即key值
}
