package it.cdigruttola.practices.ws.constraint;

import it.cdigruttola.practices.ws.validator.VatCodeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = VatCodeValidator.class)
public @interface VatCode {

    String message() default "{it.cdigruttola.practices.ws.constraint.VatCode.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
