def is_palindrome(list):
    left_index = 0
    right_index = len(list) - 1
    
    while left_index < right_index:
        if list[left_index] != list[right_index]:
            return False
            
        left_index += 1
        right_index -= 1
    
    return True
    
    
        
    
