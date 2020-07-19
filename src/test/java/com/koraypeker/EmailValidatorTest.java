package com.koraypeker;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void isValidEmail_ShouldValid_WhenEmailIsValid(){
        String email = "koraypeker1453@gmail.com";
        boolean isValid = EmailValidator.isValidEmail(email);
        Assert.assertTrue(isValid);
    }

    @Test
    public void isValidEmail_ShouldInvalid_WhenEmailIsNotValid(){
        String email = "koraypeker@.com";
        boolean isValid = EmailValidator.isValidEmail(email);
        Assert.assertTrue(isValid);
    }

}
