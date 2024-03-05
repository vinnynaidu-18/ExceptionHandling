package exception;

import java.util.Locale;

public class ExceptionService {
    public String great(String input) {
        String upperCase = null;

        try {
             upperCase = input.toUpperCase();
        } finally {

                System.out.println("from finally block without catch block");

            }

            return upperCase;

        }
    }


