package com.example.form.Validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MinAgeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAgeConstaint {
    String message() default "Age phai lon hon 18 va nho hon 60";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
