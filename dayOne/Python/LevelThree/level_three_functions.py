def flatten_list(numbers):
                
    new_list = []
    
    for row in numbers:
        for element in row:
            new_list.append(element)
            
    return new_list
    
    
numbers = [
    [9, 0, 7],
    [3, 5, 1],
    [8, 1, 7],
    [9, 9, 6]
]

new_list = flatten_list(numbers)


print("Given list:", numbers)
print("New list:", new_list)
