/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test 
    public void testEmptyString() {
        //Arranje
        Calculator calculator = new Calculator();
        //Act
        int number = calculator.Add("");
        //Assert
        assertEquals(number, 0);
    }

    @Test
    public void testOneNumberString() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int number = calculator.Add("3");
        // Assert
        assertEquals(number, 3);
    }

    @Test
    public void testTwoNumberString() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int number = calculator.Add("2,3");
        // Assert
        assertEquals(number, 5);
    }

    @Test
    public void testUnkownNumberString() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int number = calculator.Add("2,3,4,5,6");
        // Assert
        assertEquals(number, 20);
    }

    @Test
    public void testCommaOrNewLineNumberString() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int number = calculator.Add("1,2\n3");
        // Assert
        assertEquals(number, 6);
    }

    @Test
    public void testDelimitersString() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int number = calculator.Add("//;\n1,2\n3");
        // Assert
        assertEquals(number, 6);
    }
}
