import math

def replace_non_perfect_square_numbers(list):

    result = []
    
    for number in list:
        sqrt = int(math.sqrt(number))
            
        if sqrt * sqrt == number:
            result.append(number)
        else:
            result.append(-1)
                
    return result
    
numbers = [4, 7, 9, 10, 49, 6]
result = replace_non_perfect_square_numbers(numbers)

print("New List: ", result)
