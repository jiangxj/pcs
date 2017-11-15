package com.mzcm.pcs.datasource;

import java.lang.annotation.*;

/**
 * Created by xiaoi-010 on 2017/11/15.
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String name();
}
