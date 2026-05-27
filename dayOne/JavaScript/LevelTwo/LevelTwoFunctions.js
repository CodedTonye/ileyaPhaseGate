function getRepeatedValues(numbers) {

    let sizeCount = 0;
    
    for (let index = 0; index < numbers.length; index++) {
        for (let indexCheck = index + 1; indexCheck < numbers.length; indexCheck++) {
            if (numbers[index] === numbers[indexCheck]) {
                sizeCount++;
            }
        }
    }
    
    
    let repeatedValues = new Array(sizeCount).fill(0);
    let resultIndex = 0;
    
    for (let arrayIndex = 0; arrayIndex < numbers.length; arrayIndex++) {
        for (let indexCheck = arrayIndex + 1; indexCheck < numbers.length; indexCheck++) {
            if (numbers[arrayIndex] === numbers[indexCheck]) {
                repeatedValues[resultIndex] = numbers[arrayIndex];
                resultIndex++;
            }
        }
    }
    return repeatedValues;
}

let numbers = [1, 2, 3, 2, 4, 3];
let newArray = getRepeatedValues(numbers);

console.log(numbers);
console.log(newArray);

console.log();



function moveAllZeroes(numbers) {
    let tempArray = new Array(array.length).fill(0);
    let newIndex = 0;
        
    for (let index = 0; index < array.length; index++) {
        if (array[index] != 0) {
           tempArray[newIndex] = array[index];
           newIndex++;
        }          
    }
  
    return tempArray;
}

let array = [5, 0, 3, 0, 2, 0];
let tempArray = moveAllZeroes(array);

console.log(array);
console.log(tempArray);























