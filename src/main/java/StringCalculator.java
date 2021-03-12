public class StringCalculator {
    public static int add(String str) throws Exception{
        if(str.isEmpty())
            return 0;

        String delimiters = ",|\n";

        if(str.startsWith("//")){
            delimiters = delimiters + "|" + str.substring(2,3);
            str = str.substring(4);
        }
        String[] numbers = str.split(delimiters);
        int sum = 0;
        for(String number:numbers) {
            int eachNum = Integer.parseInt(number);
            if(eachNum < 0)
                throw new Exception("negatives not allowed");

            sum += eachNum;
        }
        return sum;
    }
}
