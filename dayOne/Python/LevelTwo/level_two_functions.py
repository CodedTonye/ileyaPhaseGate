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
