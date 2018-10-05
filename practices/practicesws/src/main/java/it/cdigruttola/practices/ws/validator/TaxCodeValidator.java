package it.cdigruttola.practices.ws.validator;

import it.cdigruttola.practices.ws.constraint.TaxCode;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TaxCodeValidator implements ConstraintValidator<TaxCode, String> {

    private int oddMatching[] = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23};

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return checkLastDigit(s.toUpperCase());
    }

    private boolean checkLastDigit(String taxCode) {
        int sum = 0;
        for (int i = 0; i < taxCode.length() - 1; i++) {
            char c = taxCode.charAt(i);
            if (i % 2 == 1) {
                if (Character.isLetter(c)) {
                    sum += (c - 65);
                } else {
                    sum += (c - 48);
                }
            } else {
                if (Character.isLetter(c)) {
                    sum += oddMatching[c - 65];
                } else {
                    sum += oddMatching[c - 48];
                }
            }
        }
        sum = sum % 26;
        return ((int) taxCode.charAt(taxCode.length() - 1)) == (sum + 65);
    }
}
