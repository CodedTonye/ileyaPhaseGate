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


console.log();


function rotateArray(numbers, k) {
    k = k % array.length;                           
    let result = new Array(array.length).fill(0);   
    for (let index = 0; index < array.length; index++) {        
        result[(index + k) % array.length] = array[index];    
    }
    return result;                                
}


const array = [1, -9, 3, 0, 8];
console.log("Given Array :", numbers);
console.log("k = 2    :", rotateArray(array, 2));
console.log("k = 5    :", rotateArray(array, 5));
console.log("k = 0    :", rotateArray(array, 0));


console.log();


function merge(arrayOne, arrayTwo) {

    let result = arrayOne.concat(arrayTwo);
    
    for (let index = 0; index < result.length - 1; index++) {
        for (let element = 0; element < result.length - 1 - index; element++) {
            if (result[element] > result[element + 1]) {
                let temp = result[element];
                result[element] = result[element + 1];
                result[element + 1] = temp;
            }
        }
    }
    
    return result;
}


const arrayOne = [3, 5, 1];
const arrayTwo = [2, 4, 6];

const result = merge(arrayOne, arrayTwo);

console.log("Array 1:", arrayOne);
console.log("Array 2:", arrayTwo);
console.log("Merged :", result);


