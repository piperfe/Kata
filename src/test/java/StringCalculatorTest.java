import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StringCalculatorTest {

    private StringCalculator calculator = new StringCalculator();

    @Test
    public void add_numbers_empty_string() throws Exception {
        int result = calculator.sum("");

        assertThat(0, is(result));
    }

    @Test
    public void add_numbers_one_parameter() throws Exception {
        int result = calculator.sum("1");

        assertThat(1, is(result));
    }

    @Test
    public void add_numbers_two_parameters() throws Exception {
        int result = calculator.sum("1,2");

        assertThat(3, is(result));
    }

    @Test
    public void add_numbers_n_parameters() throws Exception {
        int result = calculator.sum("1,2,3,4");

        assertThat(10, is(result));
    }

    @Test
    public void add_numbers_n_parameters_with_parameter_in_a_new_line() throws Exception {
        int result = calculator.sum("1,2,3,4\n5");

        assertThat(15, is(result));
    }
}