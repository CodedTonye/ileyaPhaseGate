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


print()


def rotate_list(list, k):

    k = k % len(list)                              
    result = [0] * len(list)                       
    for index in range(len(list)):                 
        result[(index + k) % len(list)] = list[index]
        
    return result                                 


list = [1, -9, 3, 0, 8]

print("Given List :", list)
print("k = 2  :", rotate_list(list, 2))
print("k = 5  :", rotate_list(list, 5))
print("k = 0  :", rotate_list(list, 0))
