/**
 * Calculator
 */
public class Calculator {

  private String negativeNumbers = "";

  public int add(String numbers) throws Exception {

    int result = 0;

    if(!numbers.isEmpty() && numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
      String delimiter = numbers.substring(2, numbers.indexOf('\n'));
      numbers = numbers.substring(numbers.indexOf('\n') + 1);
      numbers = numbers.replaceAll(delimiter, ",");
    }

    if(!negativeNumbers.isEmpty()) throw new Exception("negatives not allowed: "+ numbers.split(",")[0]);
    else if(numbers.isEmpty()) return result;

    numbers = numbers.replace("\n", ",");

    if(Integer.valueOf(numbers.split(",")[0]) < 0)
      negativeNumbers = negativeNumbers + " " + numbers.split(",")[0];

    else if(Integer.valueOf(numbers.split(",")[0]) > 1000 && numbers.split(",").length==1)
      result = 0;

    else if(Integer.valueOf(numbers.split(",")[0]) <= 1000 && numbers.split(",").length==1)
      result = Integer.valueOf(numbers.split(",")[0]);

    else if(numbers.split(",").length==1)
      result = Integer.valueOf(numbers);

    else
      result = Integer.valueOf(numbers.split(",")[0]) + add(numbers.substring(numbers.indexOf(',') + 1));

    return result;
  }
}
