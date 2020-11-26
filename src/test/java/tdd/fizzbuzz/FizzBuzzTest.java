package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shoud_output_order_nubmer_string_when_common_order_given() throws Exception {
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("1",actual);
    }

}
