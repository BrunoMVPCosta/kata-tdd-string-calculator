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

    String p = delimiterNumbersArray[0].replace("//", "");
    System.out.println("P: " + p);

    delimiter +=  '|' + p;

    System.out.print("Delimiter: " + delimiter);

    int total = 0;
    for(int i = 0; i < delimiterNumbersArray.length; i++) {
      if(!delimiterNumbersArray[i].startsWith("//")){
        System.out.println("number: " + delimiterNumbersArray[i]);
      total += Integer.parseInt(delimiterNumbersArray[i]);
      }
    }
    return total;
  }
}