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
        
         // Even Digits
        for (int i = 1; i < String.valueOf(reversednum).length(); i+=2) {
            int evenNumber = (String.valueOf(reversednum).charAt(i)) * 2;
            if (evenNumber > 9) {
                evenNumber -= 9;
            }
            sum2 += evenNumber;
        }

        // Gathering Total Sum
        sum_total = sum1 + sum2;
        System.out.println(sum_total);
        if (sum_total%10 == 0){
            System.out.println("Valid Credit Card.");
        }
        else{
            System.out.println("Invalid Credit Card.");
        }
    }
}
