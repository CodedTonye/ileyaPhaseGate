function encrypt(text) {
        
    let result = "";
        
    for(let count = 0; count < text.length; count++) {
        let letter = text.charAt(count);
            
        let scrambledCharCode = letter.charCodeAt(0) + 3;
        
        let scrambledLetter = String.fromCharCode(scrambledCharCode);
            
        result += scrambledLetter;
    }
    return result;
}
 
    
function decrypt(text) {

    let result = "";
        
    for(let count = 0; count < text.length; count++) {
        let letter = text.charAt(count);
            
        let originalCharCode = letter.charCodeAt(0) - 3;
        
        let originalLetter = String.fromCharCode(originalCharCode);
            
        result += originalLetter;
    }
    return result;
}



const password = "Caeser";
console.log ("Original: " + password);
            
const encrypted = encrypt(password);
console.log("Encrypted: " + encrypted);
            
const decrypted = decrypt(encrypted);
console.log("Decrypted: " + decrypted);
    
