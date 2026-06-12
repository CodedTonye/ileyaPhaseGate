import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        long creditCardNumber = inputCollector.nextLong();
        int[] cardDigits = convertNumberToArray(creditCardNumber);

        System.out.println("*****************************************");
        System.out.println("**Credit Card Type: " + getCardType(cardDigits));
        System.out.println("**Credit Card Number: " + getCardNumber(cardDigits));
        System.out.println("**Credit Card Digit Length: " + getCardLength(cardDigits));      
        System.out.println("**Credit Card Validity Status: " + isValidCard(cardDigits));
        System.out.println("*****************************************");
    }

    
    public static String getCardNumber(int[] cardDigits) {
    
        String cardNumber = "";
        for (int count = 0; count < cardDigits.length; count++) {
           // if (count > 0 && count % 4 == 0) {
             //   cardNumber += "-";
           // }
            cardNumber += cardDigits[count];
        }
        return cardNumber;
    }

   
    public static int getCardLength(int[] cardDigits) {
        return cardDigits.length;
    }


    public static int[] convertNumberToArray(long cardNumber) {
    
        long temporaryCardNumber = cardNumber;
        int count = 0;
        
        while (temporaryCardNumber > 0) {
            count++;
            temporaryCardNumber = temporaryCardNumber / 10;
        }
        
        int[] cardDigits = new int[count];
        for (int digit = count - 1; digit >= 0; digit--) {
            cardDigits[digit] = (int)(cardNumber % 10);
            cardNumber = cardNumber / 10;
        }
        return cardDigits;
    }


    public static String getCardType(int[] cardDigits) {
    
        if (cardDigits.length == 0) {
            return "Unknown Card";
        }
        
        if (cardDigits[0] == 4) {
            return "Visa Card";
        }
        
        if (cardDigits[0] == 5) {
            return "MasterCard";
        }
        
        if (cardDigits[0] == 6) {
            return "Discover Card";
        }
        
        if (cardDigits.length > 1
                && cardDigits[0] == 3
                && cardDigits[1] == 7) {
            return "American Express Card";
        }
        return "Unknown Card";
    }

    public static int calculateSumOfDoubledEvenPositionDigits(int[] cardDigits) {
    
        int doubledDigitSum = 0;
        
        for (int currentDigit = cardDigits.length - 2; currentDigit >= 0; currentDigit -= 2) {
        
            int doubledDigit = cardDigits[currentDigit] * 2;
            
            if (doubledDigit > 9) {
                int tensDigit  = doubledDigit / 10;
                int unitsDigit = doubledDigit % 10;
                doubledDigit   = tensDigit + unitsDigit;
            }
            doubledDigitSum += doubledDigit;
        }
        return doubledDigitSum;
    }

    public static int calculateSumOfOddPositionDigits(int[] cardDigits) {
    
        int oddPositionDigitSum = 0;
        
        for (int currentdigit = cardDigits.length - 1; currentdigit >= 0; currentdigit -= 2) {
            oddPositionDigitSum += cardDigits[currentdigit];
        }
        return oddPositionDigitSum;
    }

    public static String isValidCard(int[] cardDigits) {
        
        int doubledDigitSum     = calculateSumOfDoubledEvenPositionDigits(cardDigits);
        int oddPositionDigitSum = calculateSumOfOddPositionDigits(cardDigits);
        int digitSum            = doubledDigitSum + oddPositionDigitSum;
        
        if (digitSum % 10 == 0) {
            return "Valid";
        }
        return "Invalid";    
        
    } 
}



