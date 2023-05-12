class Credit_Validation {
    /*
    The Luhn algorithm test is used as a credit card digit test for many companies. 
    It helps determine if a user accidently enters an incorrect credit card number.
    To valid an existing credit card:
    Reverse the order of the digits in the number.
    Perform a partial sum of the odd digits (digits 1, 3, etc) – sum1
    Take the second, fourth ... and every other even digits in the reversed digits
    Multiply each digit by two and sum the digits, if the answer is greater than 9 
    then add the 2 digits to form partial sums for the even digits
    Sum the partial sums of the even digits to form sum2
    If sum1 + sum2 ends in zero then the original number is valid, otherwise it is invalid.
    */
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
        if (sum_total%10 == 0){
            System.out.println("Valid Credit Card.");
        }
        else{
            System.out.println("Invalid Credit Card.");
        }
    }
}

class Data{
    /*
    Prints data
    */
    // Prints Data
    System.out.println(data);
}
