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


print()


def merge(list_one, list_two):

    result = list_one + list_two

    for index in range(len(result) - 1):
        for element in range(len(result) - 1 - index):
            if result[element] > result[element + 1]:
                temp = result[element]
                result[element] = result[element + 1]
                result[element + 1] = temp;
            
    return result
    
    
list_one = [3, 5, 1]
list_two = [2, 4, 6]

result = merge(list_one, list_two)

print("Array 1:", list_one)
print("Array 2:", list_two)
print("Merged:", result)






























