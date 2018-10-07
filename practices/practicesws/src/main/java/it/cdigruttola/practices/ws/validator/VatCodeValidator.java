package it.cdigruttola.practices.ws.validator;

import it.cdigruttola.practices.ws.constraint.VatCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VatCodeValidator implements ConstraintValidator<VatCode, String> {

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = Character.getNumericValue(s.charAt(i));
            if (i % 2 == 0) {
                sum += c;
            } else {
                if (c * 2 > 9) {
                    sum += c * 2 - 9;
                } else {
                    sum += c * 2;
                }
            }
        }
        return sum % 10 == 0;
    }

}
