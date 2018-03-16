package validator;

import java.util.regex.Pattern;


public class DomainValidator {
      public static boolean isValid(String domain)
    {
        String domainRegex = "^\\.[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
                                  
        Pattern pat = Pattern.compile(domainRegex);
        if (domain == null)
            return false;
        return pat.matcher(domain).matches();
    }
}
