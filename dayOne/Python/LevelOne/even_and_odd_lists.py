def split_list(lists):
    even_list = []
    odd_list = []
    
    for number in lists:
        if number % 2 == 0:
            even_list.append(number)
        else:
            odd_list.append(number)
            
    return [even_list, odd_list]
    
numbers = [45, 60, 3, 10, 9, 22]
result = split_list(numbers)

print("Even numbers: ", result[0])
print("Odd numbers: ", result[1])
