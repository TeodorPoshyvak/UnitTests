package org.example.Sum;

import javax.validation.Validation;
import javax.validation.ValidationException;

public class ValidateSum {
    public void validate(int n) throws ValidationException {
        if (n <= 0) throw new ValidationException("Please, entery a positive number");
    }
}

