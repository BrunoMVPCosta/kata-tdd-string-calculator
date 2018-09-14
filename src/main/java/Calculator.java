
/**
 * Calculator
 */
import java.util.regex.*;
import java.lang.Exception;

public class Calculator {
  public int add(String numbers) throws Exception{
    String errorMessage = "negatives not allowed: ";
    int result = 0;
    String delimiters = "\n|,";
    if (! numbers.equals("")) {
      Pattern pattern = Pattern.compile("//(.)\n(.*)");
      Matcher matcher = pattern.matcher(numbers);
      if (matcher.find()) {
        delimiters = matcher.group(1);
        numbers = matcher.group(2);
      }
      String[] splits = numbers.split(delimiters);
      for (String digit : splits) {
        int intDigit = Integer.parseInt(digit);
        if (intDigit < 0) {
          result = -1;
          errorMessage += digit + ",";
        } else {
          result += intDigit < 1000 ? Integer.parseInt(digit) : 0;
        }
      }
    }
    if (result < 0)
      throw new Exception(errorMessage.substring(0, errorMessage.length()-1));

    return result;
  }
}
