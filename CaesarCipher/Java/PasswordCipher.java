public class PasswordCipher {
    public static void main(String[] args) {
    
        String password = "Caeser";
        System.out.println("Original: " + password);
        
        String encrypted = encrypt(password);
        System.out.println("Encrypted: " + encrypted);
        
        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    
    
    public static String encrypt(String text) {
        
        String result = "";
        
        for(int count = 0; count < text.length(); count++) {
            char letter = text.charAt(count);
            
            char scrambledLetter = (char) (letter + 3);
            
            result += scrambledLetter;
        }
        return result;
    }
    
    public static String decrypt(String text) {
    
        String result = "";
        
        for(int count = 0; count < text.length(); count++) {
            char letter = text.charAt(count);
            
            char originalLetter = (char) (letter - 3);
            
            result += originalLetter;
        }
        return result;
    }
}
