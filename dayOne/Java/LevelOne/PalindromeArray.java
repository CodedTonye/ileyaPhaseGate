public class PalindromeArray {

//    public static void main(String[] args) {
//        int[] numbers = {45, 0, 8, 0, 45};
//               
//        System.out.println("Array is Palindrome: " + isPalindrome(numbers));
//    }
    
    
    public static boolean isPalindrome(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
    
        while (leftIndex < rightIndex) {
            if (array[leftIndex] != array[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
            
        return true;        
    }
    
}
