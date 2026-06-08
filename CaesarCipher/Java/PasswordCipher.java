public class PasswordCipher {
    public static void main(String[] args) {
    
//        String secretPassword = encrypt("Zion", 3);  
        String password = "Zion";
        System.out.println("Original: " + password);
        
        String encrypted = encrypt(password, 3);
        System.out.println("Encrypted: " + encrypted);
        
//        String decrypted = decrypt(password);
        String decrypted = decrypt(encrypted, -3);
        System.out.println("Decrypted: " + decrypted);
    }
    
    
    public static String encrypt(String text, int shift) {
        
        String result = "";
        int dynamicShift = ((shift % 26) + 26) % 26; 
        
        for(int count = 0; count < text.length(); count++) {
            char letter = text.charAt(count);
            
            char scrambledLetter = letter;
            
            if (letter >= 'a' && letter <= 'z') {
                scrambledLetter = (char) ((letter - 'a' + dynamicShift) % 26 + 'a');
            } else if (letter >= 'A' && letter <= 'Z') {
                scrambledLetter = (char) ((letter - 'A' + dynamicShift) % 26 + 'A');
            }
            
            result += scrambledLetter;
        }
        return result;
    }
    
    
    public static String decrypt(String text, int shift) {
    
        return encrypt(text, shift);
    
//        String result = "";
//        int dynamicShift = ((shift % 26) + 26) % 26;
//        
//        for(int count = 0; count < text.length(); count++) {
//            char letter = text.charAt(count);
//            
//            char originalLetter = letter;
//            
//            if (letter >= 'a' && letter <= 'z') {
//                originalLetter = (char) ((letter - 'a' - dynamicShift) % 26 + 'a');
//            } else if (letter >= 'A' && letter <= 'Z') {
//                originalLetter = (char) ((letter - 'A' - dynamicShift) % 26 + 'A');
//            }
//            
//            result += originalLetter;
//        }
//        return result;
   }
}












