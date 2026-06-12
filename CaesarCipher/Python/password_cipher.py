def encrypt(text):

    result = ""
    
    for letter in text:
    
        scrambled_letter = chr(ord(letter) + 3)
        
        result += scrambled_letter
        
    return result
    
    
def decrypt(text):

    result = ""
    
    for letter in text:
    
        original_letter = chr(ord(letter) - 3)
        
        result += original_letter
        
    return result
    
    
password = "Caeser"
print("Original: ", password)

encrypted = encrypt(password)
print("Encrypted: ", encrypted)

decrypted = decrypt(encrypted)
print("Decrypted: ", decrypted)
