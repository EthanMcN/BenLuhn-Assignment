class Credit_Validation {
    public static void main (String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum_total = 0;
        
        // Reverses the card number that the user has entered
        String cardnum = "1234567890";

        String reversednum = cardnum;
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(reversednum);
 
        // reverse StringBuilder input1
        input1.reverse();

        // Odd Digits
        for (int i = 0; i < String.valueOf(reversednum).length(); i+=2){
            int oddNumber = (reversednum.charAt(i));
            sum1 += oddNumber;
        }
        
