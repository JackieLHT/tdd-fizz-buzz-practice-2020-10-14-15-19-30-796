package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_order_number_string_when_countOff_given_normal_order() throws Exception {
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("1",actual);
    }

    @Test
    public void should_return_order_Fizz_when_countOff_given_multiple_of_3_order() throws Exception {
        int order = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("Fizz",actual);
    }

    @Test
    public void should_return_order_Buzz_when_countOff_given_multiple_of_5_order() throws Exception {
        int order = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("Buzz",actual);
    }

    @Test
    public void should_return_order_Whizz_when_countOff_given_multiple_of_7_order() throws Exception {
        int order = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("Whizz",actual);
    }

    @Test
    public void should_return_order_FizzBuzz_when_countOff_given_multiple_of_3_and_5_order() throws Exception {
        int order = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("FizzBuzz",actual);
    }

    @Test
    public void should_return_order_FizzWhizz_when_countOff_given_multiple_of_3_and_7_order() throws Exception {
        int order = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("FizzWhizz",actual);
    }

    @Test
    public void should_return_order_BuzzWhizz_when_countOff_given_multiple_of_5_and_7_order() throws Exception {
        int order = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(order);
        assertEquals("BuzzWhizz",actual);
    }

}
