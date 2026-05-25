function isPalindrome(array) {
    
    left_index = 0;
    right_index =  - 1;
    
    while (left_index < right_index) {
        if (array[left_index] !== array[right_index]) {
            return false;
        }    
        left_index++;
        right_index--;
    }
    return true;
    
}


const number = [45, 0, 8, 0, 45];

console.log("Array is Palindrome:", isPalindrome(number));
