function flattenArray(array) {
    
    let newArray = [];
        
    for (let row = 0; row < array.length; row++) {
        for (let column = 0; column < array[row].length; column++) {
            newArray.push(array[row][column]);    
            }
            
        }
               
        return newArray;
}

const numbers = [
    [9, 0, 7],
    [3, 5, 1],
    [8, 1, 7],
    [9, 9, 6]
];

const newArray = flattenArray(numbers);

console.log("Given Array:", numbers)
console.log("New Array:", newArray)
