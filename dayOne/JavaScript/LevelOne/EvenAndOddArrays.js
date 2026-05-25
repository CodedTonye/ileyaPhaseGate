function splitArray(arrays) {
    const evenArray = [];
    const oddArray = [];
    
    for (const number of arrays) {
        if (number % 2 === 0) {
            evenArray.push(number);
        } else {
            oddArray.push(number)
        }
    }
    
    return [evenArray, oddArray];
}

const numbers = [45, 60, 3, 10, 9, 22];
const result = splitArray(numbers);

console.log("Even arrays: ", result[0]);
console.log("Odd arrays: ", result[1]);
