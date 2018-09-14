import java.util.ArrayList;

/**
 * Calculator
 */
public class Calculator {
  public int Add(String numbers) {
    String[] parts;
    if(numbers == "")
      return 0;
    if(numbers.contains("/")){
      char newDelimiter = numbers.charAt(2);
      String[] aux = numbers.split("\n"); 
      parts = aux[1].split(""+ newDelimiter); 
    } else {
      parts = numbers.split(",|\\n");
    }
    int sum = 0;
    ArrayList<Integer> negatives = new ArrayList<Integer>();
    int j = 0;
    for(int i = 0; i < parts.length; i++) {
      if(parts[i] == "")
        return sum;
      else if(Integer.parseInt(parts[i]) < 0){
        negatives.add(j, Integer.parseInt(parts[i]));
        j++;
        continue;
      } else if(Integer.parseInt(parts[i]) > 1000)
        continue;

      sum += Integer.parseInt(parts[i]);
    }
    if(negatives.size() > 0){
      String total_negatives = "";
        for (int n : negatives) {
          total_negatives = total_negatives+" " + n;
        }


      throw new IllegalArgumentException("negatives not allowed:" + total_negatives);
    }

    return sum;
  }
}