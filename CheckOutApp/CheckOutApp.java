import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckOutApp {

    public static void main(String[] args) {
    
        Scanner inputCollector = new Scanner(System.in);
        
        int maxItems = 100;
        String[] items = new String[maxItems];
        int[] quantities = new int[maxItems];
        double[] unitPrices = new double[maxItems];
        int itemCount = 0;
        
        System.out.print("What is the customer's Name?\n");
        String customerName = inputCollector.nextLine();
        
        String addMore;
        do {
            System.out.print("What did the customer buy?\n");
            items[itemCount] = inputCollector.nextLine();
            
            System.out.print("How many pieces?\n");
            quantities[itemCount] = inputCollector.nextInt();
            
            System.out.print("How much per unit?\n");
            unitPrices[itemCount] = inputCollector.nextDouble();
            inputCollector.nextLine();
            
            System.out.print("Add more items?\n");
            addMore = inputCollector.nextLine().trim().toLowerCase();
            
            itemCount++;
        } while (addMore.equals("yes") && itemCount < maxItems);
        
        System.out.print("What is your name?\n");
        String cashierName = inputCollector.nextLine();
        
        System.out.print("How much discount will be applied?\n");
        double discountPercent = inputCollector.nextDouble();
        
        double subTotal = 0;
        for (int count = 0; count < itemCount; count++) {
            subTotal += (quantities[count] * unitPrices[count]);
        }
        
        double discountAmount = subTotal * (discountPercent / 100);
        double vatAmount = subTotal * 0.075;
        double billTotal = subTotal - discountAmount + vatAmount;
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy h:mm:ss a");
        String formattedDate = currentDateTime.format(formatter);
        
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACUALAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03264263736");
        System.out.println("Date: " + formattedDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("=========================================================");
        System.out.printf("%15s %10s %10s %16s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------");
        
        for (int count = 0; count < itemCount; count++) {
            double totalPerItem = quantities[count] * unitPrices[count];
            System.out.printf("%15s %10d %10.2f %16.2f\n", items[count], quantities[count], unitPrices[count], totalPerItem);
        }    
        
        System.out.println("---------------------------------------------------------");
        System.out.printf("%38s: %16.2f\n", "Sub total", subTotal);
        System.out.printf("%38s: %16.2f\n", "Discount", discountAmount);
        System.out.printf("%38s: %16.2f\n", "VAT @ 7.5%", vatAmount);
        System.out.println("=========================================================");
        System.out.printf("%38s: %16.2f\n", "Bill Total", billTotal);
        System.out.println("=========================================================");
        System.out.printf("THIS IS NOT A RECEIPT, KINDLY PAY %.2f\n", billTotal);
        System.out.println("=========================================================");
        
        System.out.print("How much did the customer pay to you?\n");
        double amountPaid = inputCollector.nextDouble();
        double balance = amountPaid - billTotal;
        
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACUALAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03264263736");
        System.out.println("Date: " + formattedDate);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("=========================================================");
        System.out.printf("%15s %10s %10s %16s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------");
        
        for (int count = 0; count < itemCount; count++) {
            double totalPerItem = quantities[count] * unitPrices[count];
            System.out.printf("%15s %10d %10.2f %16.2f\n", items[count], quantities[count], unitPrices[count], totalPerItem);
        } 
        
        System.out.println("---------------------------------------------------------");
        System.out.printf("%38s: %16.2f\n", "Sub total", subTotal);
        System.out.printf("%38s: %16.2f\n", "Discount", discountAmount);
        System.out.printf("%38s: %16.2f\n", "VAT @ 7.5%", vatAmount);
        System.out.println("=========================================================");
        System.out.printf("%38s: %16.2f\n", "Bill Total", billTotal);
        System.out.printf("%38s: %16.2f\n", "Amount Paid", amountPaid);
        System.out.printf("%38s: %16.2f\n", "Balance", balance);
        System.out.println("=========================================================");
        System.out.printf("         THANK YOU FOR YOUR PATRONAGE        ");
        System.out.println("=========================================================");
    }
}



















