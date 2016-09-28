/*
 * Class to validate CNP using regex
 */
package regex;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author mihaicoman
 */
public class RegexDynamicExpressionCheck {
    
    public static void main(String[] args){
       
        // the regular expresion for CNP
        String regex = "\\b([1-2]|[5-6])\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]"
                + "\\d|3[01])(0[1-9]|[1-4]\\d|5[0-2]|99)\\d{4}\\b";
        // create a pattern using introduced regular expresion
        Pattern pattern = Pattern.compile(regex);
        // read the source string using a new Scanner object
        Scanner scannerSourceString = new Scanner(System.in);
        System.out.println("Insert source string: ");
        String source = scannerSourceString.next();
       
        /* create a substring to be able to verify if the date 
        included in the CNP is valid */
        
        String sursa = source.substring(1,7);
                
        // create the matcher as result of applying regex on source string
        Matcher matcher = pattern.matcher(source);
        boolean found = false;
        // if the regular expression or pattern was found
        while (matcher.find()&& DateValidator.isThisDateValid(sursa,"yyMMdd")) {
            String result;
            result = String.format("I found CNP \"%s\" starting at " + 
                    "index %d until index %d.",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            System.out.println(result);
            found = true;
        }
        // if regular expression or pattern was not found in source string
        if (!found) {
            System.out.println("Invalid CNP, plase try again :(");
        }
        
    }
}
