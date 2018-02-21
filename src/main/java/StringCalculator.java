
public class StringCalculator {

    public int sum(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        if(s.contains(",")){
            String[] numbers = s.split(",");
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            return sum;
        }

        return Integer.parseInt(s);
    }
}
