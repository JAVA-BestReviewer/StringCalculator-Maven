public class StringCalculator {
    public static int add(String str){
        if(str.isEmpty())
            return 0;

        String delimiters = ",|\n";

        if(str.startsWith("//")){
            delimiters = delimiters + "|" + str.substring(2,3);
            str = str.substring(4);
        }
        String[] numbers = str.split(delimiters);
        int sum = 0;
        for(String number:numbers)
            sum += Integer.parseInt(number);

        return sum;
    }
}
