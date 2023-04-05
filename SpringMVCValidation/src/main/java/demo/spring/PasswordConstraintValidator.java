package demo.spring;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String>{

	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = value.contains("Sat");
		  
		return result;
	}

	/*
	 * @Override public boolean isValid(String value, ConstraintValidatorContext
	 * context) {
	 * 
	 * boolean result = value.contains("Sat");
	 * 
	 * return result; }
	 */

}
