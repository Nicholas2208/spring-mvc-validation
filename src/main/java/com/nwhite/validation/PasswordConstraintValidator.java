package com.nwhite.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = value.contains("jtp");  
        return result; 
	}

}
