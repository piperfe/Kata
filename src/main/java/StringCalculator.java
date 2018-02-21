
public class StringCalculator {

    public int sum(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        if(s.contains(",")){
            String[] numbers = s.split(",");
            String[] numbers2 = new String[0];

            for (int i = 0; i < numbers.length; i++) {
               if(numbers[i].contains("\n")){
                   numbers2 = numbers[i].split("\n");
                   numbers[i] = "0";
               }
            }

            int sum = 0;

            for (int i = 0; i < numbers2.length; i++) {
                sum += Integer.parseInt(numbers2[i]);
            }

            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            return sum;
        }

        return Integer.parseInt(s);
    }
}
