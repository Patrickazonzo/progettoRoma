package com.betacom.businesscomponent.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtility {
	

	    private static final SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

	    public static boolean isValid(final String date) {

	        boolean valid = false;

	        try {
	            
	            sdf.parse(date);
	            // strict mode - check 30 or 31 days, leap year
	            sdf.setLenient(false); 
	            valid = true;

	        } catch (ParseException e) {
	            e.printStackTrace();
	            valid = false;
	        }

	        return valid;
	    }
	}


