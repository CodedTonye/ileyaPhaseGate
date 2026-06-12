import java.util.Scanner;

public class CheckOutApp {   

        static int maxItems  = 100;                      
        static String[] items = new String[maxItems];    
        static int[] quantities = new int[maxItems];       
        static double[] unitPrices = new double[maxItems];    
        static int itemCount  = 0;                  

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);        

        System.out.print("What is the customer's name? ");
        String customerName = inputCollector.nextLine();               

        collectItems(inputCollector);                                   

        System.out.print("What is your name? ");
        String cashierName = inputCollector.nextLine();                 

        System.out.print("How much discount will be applied? ");
        double discountPercent = inputCollector.nextDouble();           

        printInvoice(customerName, cashierName, discountPercent);   

        System.out.print("How much did the customer pay? ");
        double amountPaid = inputCollector.nextDouble();                

        printReceipt(customerName, cashierName, discountPercent, amountPaid);                                        
    }


    public static void collectItems(Scanner inputCollector) {
        String addMore = "yes";                            

        while (addMore.equals("yes") && itemCount < maxItems) { 

            System.out.print("What did the customer buy? ");
            items[itemCount] = inputCollector.nextLine();               

            System.out.print("How many pieces? ");
            quantities[itemCount] = inputCollector.nextInt();  
                    
            System.out.print("How much per unit? ");
            unitPrices[itemCount] = inputCollector.nextDouble();        
            inputCollector.nextLine();                                  

            itemCount++;                                   

            System.out.print("Add more items? (yes/no) ");
            addMore = inputCollector.nextLine().trim().toLowerCase();   
        }
    }

   
    public static double printStoreDetails(String customer, String cashier, double discountPercent) {

        
        System.out.println("\n=========================================================");
        System.out.println("SEMICOLON STORES");                           
        System.out.println("MAIN BRANCH");                                
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS."); 
        System.out.println("TEL: 03264263736");                             
        System.out.println("Cashier: " + cashier);                         
        System.out.println("Customer Name: " + customer);                  
        System.out.println("============================================================");

        System.out.printf("%15s %10s %10s %16s\n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("---------------------------------------------------------");

        double subTotal = 0;                                
        for (int count = 0; count < itemCount; count++) {             
            double totalPerItem = quantities[count] * unitPrices[count];   
            subTotal += totalPerItem;                      
            System.out.printf("%15s %10d %10.2f %16.2f\n", items[count], quantities[count], unitPrices[count], totalPerItem); 
        }

        
        double discountAmount = subTotal * (discountPercent / 100); 
        double vatAmount      = subTotal * 0.075;                 

        System.out.println("---------------------------------------------------------");
        System.out.printf("%38s: %16.2f\n", "Sub total",  subTotal);       
        System.out.printf("%38s: %16.2f\n", "Discount",   discountAmount); 
        System.out.printf("%38s: %16.2f\n", "VAT @ 7.5%", vatAmount);      
        System.out.println("=========================================================");

        return subTotal - discountAmount + vatAmount;      
    }

   
    public static void printInvoice(String customer, String cashier, double discountPercent) {
        double billTotal = printStoreDetails(customer, cashier, discountPercent);

        System.out.printf("%38s: %16.2f\n", "Bill Total", billTotal);      
        System.out.println("=========================================================");
        System.out.printf("THIS IS NOT A RECEIPT, KINDLY PAY %.2f\n", billTotal); 
        System.out.println("=========================================================");
    }

    
    public static void printReceipt(String customer, String cashier, double discountPercent, double amountPaid) {
        double billTotal = printStoreDetails(customer, cashier, discountPercent); 
        double balance   = amountPaid - billTotal;         

        System.out.printf("%38s: %16.2f\n", "Bill Total",  billTotal);     
        System.out.printf("%38s: %16.2f\n", "Amount Paid", amountPaid);   
        System.out.printf("%38s: %16.2f\n", "Balance",     balance);      
        System.out.println("=========================================================");
        System.out.println("         THANK YOU FOR YOUR PATRONAGE        ");           
        System.out.println("=========================================================");
    }
}
