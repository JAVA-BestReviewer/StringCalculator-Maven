public class StringCalculator {
    public static int add(String str){
        if(str.isEmpty())
            return 0;

        if(str.contains(",")){
            String[] numbers = str.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        return Integer.parseInt(str);
    }
}
