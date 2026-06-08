# Global lists to store cart items
# FUNCTION 1: Collect items in a loop until cashier says no 
# FUNCTION 2: Print store header, item list and totals, return bill total 
# Print store header
# Print column headers
# Loop through all items and print each row
# Calculate discount and VAT
# Print summary
# FUNCTION 3: Print Invoice that shows before customer pays 
# FUNCTION 4: Print Receipt that shows after customer pays 
# Create Main 


items       = []                            
quantities  = []                            
unit_prices = []                           



def collect_items():
    add_more = "yes"                       

    while add_more == "yes":                
        items.append(input("What did the customer buy? "))          
        quantities.append(int(input("How many pieces? ")))           
        unit_prices.append(float(input("How much per unit? ")))     

        add_more = input("Add more items? (yes/no) ").strip().lower() 



def print_store_details(customer, cashier, discount_percent):

    
    print("\n=========================================================")
    print("SEMICOLON STORES")                               
    print("MAIN BRANCH")                                    
    print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.") 
    print("TEL: 03264263736")                             
    print("Cashier: " + cashier)                            
    print("Customer Name: " + customer)                    
    print("=========================================================")

    
    print(f"{'ITEM':>15} {'QTY':>10} {'PRICE':>10} {'TOTAL(NGN)':>16}")
    print("---------------------------------------------------------")

    
    sub_total = 0.0                                         
    for i in range(len(items)):                            
        total_per_item = quantities[i] * unit_prices[i]    
        sub_total += total_per_item                         
        print(f"{items[i]:>15} {quantities[i]:>10} {unit_prices[i]:>10.2f} {total_per_item:>16.2f}")  

    
    discount_amount = sub_total * (discount_percent / 100)  
    vat_amount      = sub_total * 0.075                     

    
    print("---------------------------------------------------------")
    print(f"{'Sub total':>38}: {sub_total:>16.2f}")         
    print(f"{'Discount':>38}: {discount_amount:>16.2f}")    
    print(f"{'VAT @ 7.5%':>38}: {vat_amount:>16.2f}")       
    print("=========================================================")

    return sub_total - discount_amount + vat_amount         



def print_invoice(customer, cashier, discount_percent):
    bill_total = print_store_details(customer, cashier, discount_percent)  

    print(f"{'Bill Total':>38}: {bill_total:>16.2f}")        
    print("=========================================================")
    print(f"THIS IS NOT A RECEIPT, KINDLY PAY {bill_total:.2f}")  
    print("=========================================================")



def print_receipt(customer, cashier, discount_percent, amount_paid):
    bill_total = print_store_details(customer, cashier, discount_percent)  
    balance    = amount_paid - bill_total                   

    print(f"{'Bill Total':>38}: {bill_total:>16.2f}")        
    print(f"{'Amount Paid':>38}: {amount_paid:>16.2f}")     
    print(f"{'Balance':>38}: {balance:>16.2f}")              
    print("=========================================================")
    print("         THANK YOU FOR YOUR PATRONAGE        ")   
    print("=========================================================")



customer_name    = input("What is the customer's name? ")              

collect_items()                                                         

cashier_name     = input("What is your name? ")                         
discount_percent = float(input("How much discount will be applied? "))  

print_invoice(customer_name, cashier_name, discount_percent)           

amount_paid = float(input("How much did the customer pay? "))           

print_receipt(customer_name, cashier_name, discount_percent, amount_paid)  



