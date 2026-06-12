import math

def get_perfect_squared_numbers(list):

    perfect_squares = []
    
    for number in list:
        if number >= 0:
            root = int(math.sqrt(number))
            
            if root * root == number:
                perfect_squares.append(number)
                
    return perfect_squares
    
numbers = [4, 7, 9, 10, 16, 18];
new_list = get_perfect_squared_numbers(numbers)

print(new_list)
