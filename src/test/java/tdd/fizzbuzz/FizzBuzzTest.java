package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_order_nubmer_string_when_countOff_given_normal_order() throws Exception {
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("1",actual);
    }

    @Test
    public void should_return_order_fizz_when_countOff_given_multiple_of_3_order() throws Exception {
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("Fizz",actual);
    }

    @Test
    public void should_return_order_buzz_when_countOff_given_multiple_of_5_order() throws Exception {
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("Buzz",actual);
    }

    public void should_return_order_fizzbuzz_when_countOff_given_multiple_of_5_order() throws Exception {
        int order = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("FizzBuzz",actual);
    }

}
