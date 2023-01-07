package n2exercici1.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SerializeToJson {
    String path() default "/Users/marinaroyoterol/GitHub/s107/src/n2exercici1/";
}
