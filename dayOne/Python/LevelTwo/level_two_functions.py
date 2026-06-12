def get_repeated_values(numbers):

    size_count = 0
    for index in range(len(numbers)):
        for index_check in range(index + 1, len(numbers)):
            if numbers[index] == numbers[index_check]:
                size_count += 1 

    repeated_values = [0] * size_count
    result_index = 0
    
    for list_index in range(len(numbers)):
        for index_check in range(list_index + 1, len(numbers)):
            if numbers[list_index] == numbers[index_check]:
                repeated_values[result_index] = numbers[list_index]
                result_index += 1
                
    return repeated_values
    

numbers = [1, 2, 3, 2, 4, 3];
new_list = get_repeated_values(numbers)

print(numbers)
print(new_list)

print()

def move_all_zeroes(numbers):

    temp = [0] * len(numbers)
    temp_index = 0
    
    for index in range(len(numbers)):
        if numbers[index] != 0:
            temp[temp_index] = numbers[index]
            temp_index += 1
            
    return temp
    
    
numbers = [5, 0, 3, 0, 2, 0];
new_list = move_all_zeroes(numbers)

print(numbers)
print(new_list)
