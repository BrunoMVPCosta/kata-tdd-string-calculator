
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Calculator
 */

public class Calculator {
  public int add(String numbers) throws NegativeNotAllowedException {

    if (numbers.isEmpty()) return 0;

    String delimiter = ",|\n";
    String regex = "^(\\/\\/)(\\D+)(\\n)(.*?)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(numbers);

    if(matcher.matches()){
      delimiter = matcher.group(2);
      numbers = matcher.group(4);
    }

    String[] array = numbers.split(delimiter);
    int sum = 0;
    String notAllowed = "";

    for (String s : array){
      int n = Integer.parseInt(s);

      if (n < 0) notAllowed += " " + n;
      if (n <= 1000) sum += n;
    }
    if (!notAllowed.isEmpty()) throw new NegativeNotAllowedException("negatives not allowed:" + notAllowed);

    return sum;
  }
}
