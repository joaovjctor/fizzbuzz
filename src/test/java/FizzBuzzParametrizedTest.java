import org.example.FizzBuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzParametrizedTest {
    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "5, Buzz",
            "10, Buzz",
            "2, 2",
            "7, 7"
    })

    public void testFizzBuzz(int input, String expected) {
        assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }
}
