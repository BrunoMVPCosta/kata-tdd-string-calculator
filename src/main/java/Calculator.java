import javax.sound.sampled.SourceDataLine;

/**
 * Calculator
 */
public class Calculator {

  public int Add(String numbers) {
    if(numbers == ""){
      return 0;
    }
    String delimiter = ",|\\n";
    String delimiterNumbersArray[] = numbers.split(delimiter);

    delimiter +=  '|' + delimiterNumbersArray[0].replace("//", "");

    int total = 0;
    for(int i = 0; i < delimiterNumbersArray.length; i++) {
      if(!delimiterNumbersArray[i].startsWith("//")) {
      Integer number = Integer.parseInt(delimiterNumbersArray[i]);
        if (number < 0)
          throw new IllegalArgumentException("negatives not allowed " + number);
        else 
        if(number < 1000) total += number;
      }
    }
    return total;
  }
}