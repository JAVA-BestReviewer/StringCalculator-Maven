public class StringCalculator {
    public static int add(String str){
        if(str.isEmpty())
            return 0;

        String[] numbers = str.split(",|\n");

        if(numbers.length == 1){
            return Integer.parseInt(numbers[0]);
        }

        int sum = 0;
        for(int i=0; i<numbers.length; i++)
            sum += Integer.parseInt(numbers[i]);

        return sum;
    }
}
