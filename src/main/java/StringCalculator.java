public class StringCalculator {
    public static int add(String str){
        if(str.isEmpty())
            return 0;

        String[] numbers = str.split(",|\n");

        if(numbers.length == 1){
            return Integer.parseInt(numbers[0]);
        }

        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
