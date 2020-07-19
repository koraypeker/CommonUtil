package com.koraypeker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static boolean isValidEmail(String email){
        boolean validEmail = false;
        if(email != null && !email.equals("")){
            String pattern = "^([a-zA-Z0-9_\\.\\-+])+@(([a-zA-Z0-9-])+\\.)+([a-zA-Z0-9]{2,4})+$";
            Pattern emailRegexp = Pattern.compile(pattern);
            Matcher matcher = emailRegexp.matcher(email);
            validEmail = matcher.find();
        }
        return validEmail;
    }

}
