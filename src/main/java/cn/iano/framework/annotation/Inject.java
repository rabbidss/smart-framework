package cn.iano.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Inject
 *
 * 依赖注入注解
 *
 * @author 霜风折叶
 * @version 1.0
 * @date 2020/3/11 17:30
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
